package com.example.demospringbootex1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.example.demospringbootex1.infra.Protocol;
import com.example.demospringbootex1.model.Quote;
import com.example.demospringbootex1.service.QuoteService;

@Service
public class QuoteServiceImpl implements QuoteService {

  @Autowired
  private RestTemplate restTemplate;

  @Value(value = "${api.finnhub.domain}") // 'finnhub.io'
  private String finnhub; // from yml

  @Value(value = "${api.finnhub.endpoints}") // '/api/v1'
  private String endpoints; // from yml

  @Value(value = "${api.finnhub.quote.profile}")
  private String quoteProfile; // from yml

  @Value(value = "${api.finnhub.temp.param1}")
  private String tempP1; // from yml

  @Value(value = "${api.finnhub.temp.param2}")
  private String tempP2; // from yml

  @Override
  public Quote findQuote() { // throws BusinessException{
    String url = UriComponentsBuilder.newInstance() //
        .scheme(Protocol.HTTPS.name()) //
        .host(finnhub) //
        .path(endpoints) //
        .path(quoteProfile) //
        .path(tempP1) //
        .path(tempP2) //
        .build()// slove %3 problem
        .toUriString();

    System.out.println("url=" + url);
    // url=HTTPS://finnhub.io/api/v1/quote%3Fsymbol=AAPL&token=ck4flrhr01qus81pv4o0ck4flrhr01qus81pv4og
    // Invoke API + Jaskson Deserialization (JSON -> Object)
    // try {
    // wrong , json open use {}->object , Quote[] quotes = restTemplate.getForObject(url, Quote[].class);
    Quote quotes = restTemplate.getForObject(url, Quote.class);

    return quotes;
    // } catch (RestClientException e) {
    // throw new FinnhubException(Code.FINN_NOTFOUND);
    // }
  }

  /*
   * Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed: 
   * org.springframework.web.client.RestClientException: Error while extracting
   * response for type [class [Lcom.example.demospringbootex1.model.Quote;] and
   *  content type [application/json;charset=utf-8]] with root cause
   * 
   * 
   * utf-8 error： json {}開頭 OR [] 開頭
   */
}
