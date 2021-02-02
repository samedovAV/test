#Тестирование через ab с syncronized и без
##1 поток без syncronized
samedov@samedov-mi-pro:~$ ab -n 10000 -c 1 http://localhost:8080/get/vasya

Server Software:          
Server Hostname:        localhost   
Server Port:            8080  
    
Document Path:          /get/vasya  
Document Length:        11 bytes

Concurrency Level:      1  
Time taken for tests:   4.488 seconds  
Complete requests:      10000  
Failed requests:        0  
Total transferred:      1440000 bytes  
HTML transferred:       110000 bytes  
Requests per second:    2228.34 [#/sec] (mean)  
Time per request:       0.449 [ms] (mean)  
Time per request:       0.449 [ms] (mean, across all concurrent requests)  
Transfer rate:          313.36 [Kbytes/sec] received  

Connection Times (ms)  
              min  mean[+/-sd] median   max  
Connect:        0    0   0.0      0       0  
Processing:     0    0   1.1      0     103  
Waiting:        0    0   1.0      0     100  
Total:          0    0   1.1      0     103  

Percentage of the requests served within a certain time (ms)  
  50%      0  
  66%      0  
  75%      1  
  80%      1  
  90%      1  
  95%      1  
  98%      1  
  99%      1  
 100%    103 (longest request)  

##16 потоков без syncronized

samedov@samedov-mi-pro:~$ ab -n 10000 -c 16 http://localhost:8080/get/vasya

Server Software:          
Server Hostname:        localhost  
Server Port:            8080

Document Path:          /get/vasya  
Document Length:        11 bytes

Concurrency Level:      16  
Time taken for tests:   1.273 seconds  
Complete requests:      10000  
Failed requests:        0  
Total transferred:      1440000 bytes  
HTML transferred:       110000 bytes  
Requests per second:    7857.51 [#/sec] (mean)  
Time per request:       2.036 [ms] (mean)  
Time per request:       0.127 [ms] (mean, across all concurrent requests)  
Transfer rate:          1104.96 [Kbytes/sec] received  

Connection Times (ms)  
              min  mean[+/-sd] median   max  
Connect:        0    0   0.1      0       2  
Processing:     0    2   2.1      1     135  
Waiting:        0    1   1.9      1     123  
Total:          0    2   2.0      1     135  

Percentage of the requests served within a certain time (ms)  
  50%      1  
  66%      2  
  75%      2  
  80%      2  
  90%      4  
  95%      5  
  98%      6  
  99%      8  
 100%    135 (longest request)  

##32 потока без syncronized

samedov@samedov-mi-pro:~$ ab -n 10000 -c 32 http://localhost:8080/get/vasya

Server Software:          
Server Hostname:        localhost  
Server Port:            8080

Document Path:          /get/vasya  
Document Length:        11 bytes

Concurrency Level:      32  
Time taken for tests:   1.225 seconds  
Complete requests:      10000  
Failed requests:        0  
Total transferred:      1440000 bytes  
HTML transferred:       110000 bytes     
Requests per second:    8164.69 [#/sec] (mean)  
Time per request:       3.919 [ms] (mean)  
Time per request:       0.122 [ms] (mean, across all concurrent requests)  
Transfer rate:          1148.16 [Kbytes/sec] received  

Connection Times (ms)  
              min  mean[+/-sd] median   max   
Connect:        0    0   0.3      0       6  
Processing:     0    3   3.2      2      95  
Waiting:        0    3   3.0      2      90  
Total:          1    4   3.2      2      95  

Percentage of the requests served within a certain time (ms)  
  50%      2  
  66%      3  
  75%      4  
  80%      5  
  90%      7  
  95%      9  
  98%     13  
  99%     16  
 100%     95 (longest request)  

##16 потоков syncronized

samedov@samedov-mi-pro:~$ ab -n 10000 -c 16 http://localhost:8080/get/vasya

Server Software:          
Server Hostname:        localhost  
Server Port:            8080  

Document Path:          /get/vasya  
Document Length:        11 bytes

Concurrency Level:      16  
Time taken for tests:   1.258 seconds  
Complete requests:      10000  
Failed requests:        0  
Total transferred:      1440000 bytes  
HTML transferred:       110000 bytes  
Requests per second:    7946.06 [#/sec] (mean)  
Time per request:       2.014 [ms] (mean)  
Time per request:       0.126 [ms] (mean, across all concurrent requests)  
Transfer rate:          1117.41 [Kbytes/sec] received  

Connection Times (ms)  
              min  mean[+/-sd] median   max  
Connect:        0    0   0.1      0       3  
Processing:     0    2   1.9      1     122  
Waiting:        0    1   1.8      1     112  
Total:          0    2   1.9      1     122  

Percentage of the requests served within a certain time (ms)  
  50%      1  
  66%      2  
  75%      2  
  80%      2  
  90%      3  
  95%      4  
  98%      6  
  99%      8  
 100%    122 (longest request)  

##32 потока synchronized

samedov@samedov-mi-pro:~$ ab -n 10000 -c 32 http://localhost:8080/get/vasya

Server Software:          
Server Hostname:        localhost  
Server Port:            8080  

Document Path:          /get/vasya  
Document Length:        11 bytes

Concurrency Level:      32  
Time taken for tests:   1.258 seconds  
Complete requests:      10000  
Failed requests:        0  
Total transferred:      1440000 bytes  
HTML transferred:       110000 bytes  
Requests per second:    7946.97 [#/sec] (mean)  
Time per request:       4.027 [ms] (mean)  
Time per request:       0.126 [ms] (mean, across all concurrent requests)  
Transfer rate:          1117.54 [Kbytes/sec] received  

Connection Times (ms)  
              min  mean[+/-sd] median   max  
Connect:        0    0   0.3      0       6  
Processing:     0    3   3.3      2     114  
Waiting:        0    3   3.0      2     101  
Total:          1    4   3.2      2     114  

Percentage of the requests served within a certain time (ms)  
  50%      2  
  66%      3  
  75%      5  
  80%      5  
  90%      7  
  95%      9  
  98%     12  
  99%     16  
 100%    114 (longest request)  
