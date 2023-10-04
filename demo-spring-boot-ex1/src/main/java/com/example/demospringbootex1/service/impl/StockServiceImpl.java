package com.example.demospringbootex1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.example.demospringbootex1.infra.BusinessException;
import com.example.demospringbootex1.infra.Protocol;
import com.example.demospringbootex1.model.Stock;
import com.example.demospringbootex1.service.StockService;

@Service
public class StockServiceImpl implements StockService {

  @Autowired
  private RestTemplate restTemplate;

  @Value(value = "${api.finnhub.domain}") // 'finnhub.io'
  private String finnhub; // from yml

  @Value(value = "${api.finnhub.endpoints}") // '/api/v1'
  private String endpoints; // from yml

  @Value(value = "${api.finnhub.stock.profile}")
  private String stockProfile; // from yml

  @Value(value = "${api.finnhub.temp.param1}")
  private String tempP1; // from yml

  @Value(value = "${api.finnhub.temp.param2}")
  private String tempP2; // from yml



  @Override
  public Stock findStock(String symbol) throws BusinessException{ // throws BusinessException{
    String url = UriComponentsBuilder.newInstance() //
        .scheme(Protocol.HTTPS.name()) //
        .host(finnhub) //
        .path(endpoints) //
        .path(stockProfile) //
        .queryParam("symbol", symbol) //
        .path(tempP2) //
        // .build()
        .toUriString();

    System.out.println("url=" + url);
    // Invoke API + Jaskson Deserialization (JSON -> Object)
    // try {
    Stock stocks = restTemplate.getForObject(url, Stock.class);
    return stocks;
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
