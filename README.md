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
ab -n 2000000 -c 16 http://localhost:8080/vasya

Server Software:        
Server Hostname:        localhost  
Server Port:            8080  

Document Path:          /vasya  
Document Length:        107 bytes  

Concurrency Level:      16  
Time taken for tests:   318.548 seconds  
Complete requests:      2000000  
Failed requests:        0  
Non-2xx responses:      2000000  
Total transferred:      602000000 bytes  
HTML transferred:       214000000 bytes  
Requests per second:    6278.49 [#/sec] (mean)  
Time per request:       2.548 [ms] (mean)  
Time per request:       0.159 [ms] (mean, across all concurrent requests)  
Transfer rate:          1845.53 [Kbytes/sec] received  

Connection Times (ms)  
              min  mean[+/-sd] median   max  
Connect:        0    0   0.2      0      15  
Processing:     0    2   1.1      2     153  
Waiting:        0    2   1.1      2     145  
Total:          0    3   1.1      2     153  

Percentage of the requests served within a certain time (ms)  
  50%      2  
  66%      3  
  75%      3  
  80%      3  
  90%      4  
  95%      4  
  98%      6  
  99%      7  
 100%    153 (longest request)  
   
## 32 потока synchronized

ab -n 2000000 -c 32 http://localhost:8080/vasya

Server Software:        
Server Hostname:        localhost  
Server Port:            8080  

Document Path:          /vasya  
Document Length:        107 bytes  

Concurrency Level:      32  
Time taken for tests:   316.740 seconds  
Complete requests:      2000000  
Failed requests:        0  
Non-2xx responses:      2000000  
Total transferred:      602000000 bytes  
HTML transferred:       214000000 bytes  
Requests per second:    6314.33 [#/sec] (mean)  
Time per request:       5.068 [ms] (mean)  
Time per request:       0.158 [ms] (mean, across all concurrent requests)  
Transfer rate:          1856.07 [Kbytes/sec] received  

Connection Times (ms)  
              min  mean[+/-sd] median   max  
Connect:        0    0   0.4      0      24  
Processing:     1    5   2.2      4     182  
Waiting:        0    4   2.1      4     163  
Total:          1    5   2.1      5     182  

Percentage of the requests served within a certain time (ms)  
  50%      5  
  66%      5  
  75%      6  
  80%      6  
  90%      7  
  95%      9  
  98%     11  
  99%     12  
 100%    182 (longest request)  
 