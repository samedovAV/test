# Тестирование через ab с syncronized и без  
## 1 поток без syncronized
samedov@samedov-mi-pro:~$ ab -n 2000000 -c 1 http://localhost:8080/get/vasya

Server Software:          
Server Hostname:        localhost
Server Port:            8080

Document Path:          /get/vasya  
Document Length:        17 bytes

Concurrency Level:      1  
Time taken for tests:   627.053 seconds  
Complete requests:      2000000  
Failed requests:        0  
Total transferred:      300000000 bytes  
HTML transferred:       34000000 bytes  
Requests per second:    3189.52 [#/sec] (mean)  
Time per request:       0.314 [ms] (mean)  
Time per request:       0.314 [ms] (mean, across all concurrent requests)  
Transfer rate:          467.22 [Kbytes/sec] received  

Connection Times (ms)  
              min  mean[+/-sd] median   max  
Connect:        0    0   0.0      0       5  
Processing:     0    0   0.1      0      13  
Waiting:        0    0   0.1      0      13  
Total:          0    0   0.1      0      13  

Percentage of the requests served within a certain time (ms)  
  50%      0  
  66%      0  
  75%      0  
  80%      0  
  90%      0  
  95%      0  
  98%      1  
  99%      1  
 100%     13 (longest request)
 
## 16 потоков без syncronized
samedov@samedov-mi-pro:~$ ab -n 2000000 -c 16 http://localhost:8080/get/vasya

Server Software:          
Server Hostname:        localhost  
Server Port:            8080

Document Path:          /get/vasya  
Document Length:        17 bytes 

Concurrency Level:      16  
Time taken for tests:   158.154 seconds  
Complete requests:      2000000  
Failed requests:        0  
Total transferred:      300000000 bytes  
HTML transferred:       34000000 bytes  
Requests per second:    12645.94 [#/sec] (mean)  
Time per request:       1.265 [ms] (mean)  
Time per request:       0.079 [ms] (mean, across all concurrent requests)  
Transfer rate:          1852.43 [Kbytes/sec] received  

Connection Times (ms)  
              min  mean[+/-sd] median   max  
Connect:        0    0   0.2      0      14  
Processing:     0    1   0.6      1      50  
Waiting:        0    1   0.5      1      49  
Total:          0    1   0.5      1      51    

Percentage of the requests served within a certain time (ms)  
  50%      1  
  66%      1  
  75%      1  
  80%      1  
  90%      2  
  95%      2  
  98%      3    
  99%      3  
 100%     51 (longest request)  


## 32 потока без syncronized
samedov@samedov-mi-pro:~$ ab -n 2000000 -c 32 http://localhost:8080/get/vasya

Server Software:          
Server Hostname:        localhost  
Server Port:            8080

Document Path:          /get/vasya  
Document Length:        17 bytes

Concurrency Level:      32  
Time taken for tests:   148.671 seconds  
Complete requests:      2000000  
Failed requests:        0  
Total transferred:      300000000 bytes  
HTML transferred:       34000000 bytes  
Requests per second:    13452.54 [#/sec] (mean)  
Time per request:       2.379 [ms] (mean)  
Time per request:       0.074 [ms] (mean, across all concurrent requests)  
Transfer rate:          1970.59 [Kbytes/sec] received  

Connection Times (ms)  
              min  mean[+/-sd] median   max  
Connect:        0    1   0.3      1      12  
Processing:     0    2   0.6      2      26  
Waiting:        0    1   0.6      1      25  
Total:          0    2   0.6      2      27  

Percentage of the requests served within a certain time (ms)  
  50%      2  
  66%      2  
  75%      2  
  80%      3  
  90%      3  
  95%      3  
  98%      4  
  99%      5    
 100%     27 (longest request)

## 16 потоков syncronized
samedov@samedov-mi-pro:~$ ab -n 2000000 -c 16 http://localhost:8080/get/vasya

Server Software:        
Server Hostname:        localhost  
Server Port:            8080

Document Path:          /get/vasya  
Document Length:        17 bytes

Concurrency Level:      16  
Time taken for tests:   158.980 seconds  
Complete requests:      2000000  
Failed requests:        0  
Total transferred:      300000000 bytes  
HTML transferred:       34000000 bytes    
Requests per second:    12580.21 [#/sec] (mean)  
Time per request:       1.272 [ms] (mean)  
Time per request:       0.079 [ms] (mean, across all concurrent requests)  
Transfer rate:          1842.80 [Kbytes/sec] received  

Connection Times (ms)  
              min  mean[+/-sd] median   max  
Connect:        0    0   0.2      0      11  
Processing:     0    1   0.5      1     125  
Waiting:        0    1   0.5      1     116  
Total:          0    1   0.5      1     125  

Percentage of the requests served within a certain time (ms)  
  50%      1  
  66%      1  
  75%      1  
  80%      1  
  90%      2  
  95%      2  
  98%      3  
  99%      3  
 100%    125 (longest request)    

## 32 потока synchronized

samedov@samedov-mi-pro:~$ ab -n 2000000 -c 32 http://localhost:8080/get/vasya

Server Software:          
Server Hostname:        localhost  
Server Port:            8080

Document Path:          /get/vasya  
Document Length:        17 bytes

Concurrency Level:      32  
Time taken for tests:   150.398 seconds  
Complete requests:      2000000  
Failed requests:        0  
Total transferred:      300000000 bytes  
HTML transferred:       34000000 bytes  
Requests per second:    13298.05 [#/sec] (mean)  
Time per request:       2.406 [ms] (mean)  
Time per request:       0.075 [ms] (mean, across all concurrent requests)  
Transfer rate:          1947.96 [Kbytes/sec] received  

Connection Times (ms)  
              min  mean[+/-sd] median   max  
Connect:        0    1   0.3      1      13  
Processing:     0    2   0.7      2      28  
Waiting:        0    1   0.6      1      27  
Total:          0    2   0.6      2      29  

Percentage of the requests served within a certain time (ms)  
  50%      2  
  66%      2  
  75%      3  
  80%      3  
  90%      3  
  95%      3  
  98%      4  
  99%      5  
 100%     29 (longest request)  