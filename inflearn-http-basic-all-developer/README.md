## 인프런 - 모든 개발자를 위한 HTTP 웹 기본 지식(김영한 강사님)  
---------------------------------------------
[`링크`]

    이 강의는 💡
    실무에 꼭 필요한 HTTP 핵심 기능과 올바른 HTTP API 설계 방법을 학습합니다.
    
<br>

<div align=center>
웹 기술을 사용하는 개발자라면 누구나 OK! 꼭 필요한 HTTP의 핵심을 알려드립니다.
</div>

<br>

### **모든 것이 HTTP 기반**

지금 시대는 모든 것을 HTTP로 전송합니다. 우리가 잘 아는 HTML, 이미지, 영상, 파일뿐만 아니라 API로 앱과 서버가 통신할 때, 또 서버와 서버가 통신할 때도 대부분 HTTP를 사용합니다.

그래서 모바일 앱 개발자, 웹 프론트엔드 개발자, 백엔드 개발자는 모두 HTTP를 필수로 잘 알고 사용해야 합니다. 특히 백엔드 개발자는 스프링(Spring) 웹 MVC, JSP, PHP, ASP.NET, Node.js, 파이썬 장고, 루비 온 레일즈와 같은 웹 프레임워크나 기술들을 사용하는데, **이러한 웹 기술들은 모두 HTTP를 기반으로 구현**되어 있습니다.

<br>

<div align=center>
<img width="360" alt="캡쳐1" src="https://user-images.githubusercontent.com/50076031/103432732-0a4aa900-4c28-11eb-92dc-aea427f57c35.PNG">
</div>
<br>

### **처음 웹 기술을 공부하는 개발자**
HTTP를 제대로 이해하지 못한 상태에서 처음 웹 기술들을 공부하면, 깊이있게 원리를 이해하기 쉽지 않습니다. 왜냐하면 해당 기술들은 여러분이 이미 HTTP를 잘 알고 있다고 가정하고, 기능 사용법 위주로 설명하기 때문입니다. 예를 들어 스프링 웹 MVC를 처음 학습하면 HTTP와 관련된 수많은 기능과 용어가 등장하는데, 이런 기능이 왜 필요한지, 이런 용어들이 어디에서 어떤 이유로 나왔는지 명확하게 이해하기 어렵습니다. 그래서 깊이있는 이해보다는 단순히 기능 사용법 위주로 학습하게 됩니다.



### **실무에서 웹 기술을 사용하는 개발자**
실무에서 웹 기술을 사용하는 개발자
실무에서 웹 기술을 사용하며 오랜 기간 개발을 해도, 고민의 연속입니다. API URL을 이렇게 설계하는 게 맞을까? 언제 POST를 사용하고 PUT를 사용해야 할까? HTTP 상태코드는 어떤 것을 선택하는 게 좋을까? 이런 고민을 계속 하게 됩니다.

**실무 개발에 꼭 필요한 HTTP 핵심 내용을 학습**하고 기준을 세우고 싶은데, 인터넷 자료들은 조각조각 흩어져 있거나 잘못된 내용들이 많습니다. 그렇다고 HTTP 스펙이나 시중의 책들로 학습하기에는 실무에 꼭 필요하지 않은 내용도 많고, 학습량도 부담됩니다. 

<br>

### **강의 목표**

<img width="408" alt="캡쳐2" src="https://user-images.githubusercontent.com/50076031/103432752-69102280-4c28-11eb-9d96-34e588b4d026.PNG">  


여러분은 평생 HTTP 기반 위에서 개발하게 됩니다. 그래서 언젠가 한번은 HTTP를 진지하게 학습하고 정리해야 합니다. 이 강의의 학습 목표는 다음과 같습니다.
- HTTP의 전체 흐름
- HTTP의 전체 흐름을 이해할 수 있습니다.  
- 실무에 필요한 핵심 내용 위주로 설명합니다.  
- 최대한 쉽게 설명하기 위해 많은 그림과 예시를 활용해서 설명합니다.  
  
이 강의를 통해 여러분은 **실무에 꼭 필요한 HTTP 기본 지식을 모두 습득**할 수 있습니다.


### **강의 대상**

<img width="432" alt="캡쳐 3" src="https://user-images.githubusercontent.com/50076031/103432764-a5dc1980-4c28-11eb-9a24-622509ef3b94.PNG">  

여러분이 웹 또는 모바일 앱 프론트엔드, 백엔드와 같이 HTTP 기술을 사용하는 개발 직군이라면 이 강의를 통해 HTTP를 깊이있게 이해할 수 있습니다. 그중에서도 직접 HTTP API를 설계하고, 제공해야 하는 웹 애플리케이션을 개발하는 백엔드 개발자에게 가장 큰 도움이 됩니다.


### **강의 구성**
#### 1. 인터넷 네트워크
강의는 먼저 인터넷 네트워크부터 설명합니다.  
HTTP도 결국에는 TCP/IP나 UDP 기반 위에서 동작하기 때문에 아주 기본적인 인터넷 네트워크를 이해해야 합니다.


### 2. URI와 웹 브라우저 요청 흐름
URI와 URL의 개념을 확실하게 정리합니다.  

그리고 웹 브라우저 요청 흐름을 통해 HTTP 메시지가 어떻게 TCP/IP 메시지로 변하고, 네트워크를 통해 목적지까지 도착하는지, 그리고 HTML 응답을 받아와서 웹 브라우저에 렌더링 되는 과정을 설명합니다. 이를 통해 HTTP와 네트워크의 전체 사이클을 이해합니다.


### 3. HTTP 기본
HTTP의 기본 동작과 특징들을 알아봅니다. 특히 상태유지(Stateful), 무상태(Stateless)의 개념과 HTTP 메시지에 대해서 자세히 알아봅니다.


### 4. HTTP 메서드
먼저 HTTP API를 무작정 한번 설계해 봅니다. 어떤 문제가 있는지 살펴보고, 왜 HTTP 메서드가 필요한지 학습합니다.  

다양한 HTTP 메서드들을 학습하고, GET, POST, PUT, PATCH, DELETE 같은 주요 HTTP 메서드들을 언제 어떻게 사용해야 하는지 기본기를 다집니다.


### 5. HTTP 메서드 활용
실무에서 주로 사용하는 기본 활용법을 배웁니다. HTML form을 통해 메시지를 전송하는 방법, API를 통해 전송하는 방법 등을 학습합니다.  
그리고 HTTP API URL을 올바르게 설계하는 방법을 예시를 통해서 학습합니다. 이론과 실무의 한계를 극복하는 방안들도 설명합니다.

### 6. HTTP 상태코드
HTTP 상태코드에 대해 설명합니다. 어떤 상태코드를 주는게 올바른 방법인지, 그리고 2xx, 3xx, 4xx, 5xx의 제대로된 의미와 사용법을 배웁니다.


### 7. HTTP 헤더 - 일반 헤더
HTTP에는 수많은 헤더가 있습니다. 여기서는 표헌, 콘텐츠 협상, 전송 방식, 쿠키 등을 단순한 기능 설명이 아니라 예시와 사례를 통해 학습합니다.


### 8. HTTP 헤더 - 캐시
HTTP 캐시에 관한 기본 내용을 학습합니다. 캐시가 필요한 이요부터 브라우저 캐시, 프록시 캐시, 조건부 요청, 캐시 무효화 방법 등을 학습합니다.


[`링크`]: https://www.inflearn.com/course/http-%EC%9B%B9-%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC/dashboard