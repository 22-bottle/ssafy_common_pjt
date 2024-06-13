# JOBLOG
![image](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/58660479-ae5e-4f68-b13e-779cca865230)


## 목차
[1️. 개요](#1️⃣-개요)<br>
[2. 팀원 소개](#2️⃣-팀원-소개)<br>
[3. 개발 환경](#3️⃣-개발-환경)<br>
[4. 서비스 화면](#4️⃣-서비스-화면)<br>
[5. 주요 기능](#5️⃣-주요-기능)<br>
[6. 기술 소개](#6️⃣-기술-소개)<br>
[7. 설계 문서](#7️⃣-설계-문서)<br>
<br><br>

# 1️⃣ 개요
### JOBLOG는 청년이 주체적으로 취업 과정을 준비해나갈 수 있도록 취업 전반의 과정을 케어해주는 종합 취업지원 웹 서비스입니다<br>

### 💡 한곳에 모아, 한눈에 볼 수 있는 내 정보
- 이력서 작성 자동화
- 자기소개서 문항별 커스텀 카테고리화
- 나의 취준캘린더

### 💡 정보의 재사용성 극대화
- 사용자 지원 현황 트래킹을 통한 데이터 수집
- 스크랩 공고의 전형별 리뷰작성과 현직자의 기업리뷰

### 💡 개인 맞춤 연결형 지원 서비스
- 희망 직무 기반의 채용공고 추천
- 취업 궁금증을 해결할 현직자와의 실시간 화상 커피챗
<br><br>

# 2️⃣ 팀원 소개
|![image](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/18b6d48d-1e32-4375-b289-f31bfab620fe)|![image](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/4f968870-52e4-462a-8982-ed3359f69e3a)|![image](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/c7d0ce53-8dec-4738-be29-d63fec38ecaf)|![image](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/f57bf88b-1875-49d5-b446-e2b7cc0e8643)|![image](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/7d7217a6-80c9-468c-866e-a392d9166f1b)|![image](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/01e75b43-6b0d-410b-a711-003beb1ec58e)|
|:--:|:--:|:--:|:--:|:--:|:--:|
|정휘원|박시연|방소영|김보경|이현영|이희병|
|FrontEnd & Leader|FrontEnd|Infra|BackEnd|BackEnd|BackEnd|
|Data Binding<br>Function|Design & Publishing<br>UCC|Infra<br>WebRTC|CRUD<br>Function|DB<br>Batch|Certification<br>Kafka|

<br><br>

# 3️⃣ 개발 환경
<div style="display:flex; flex-direction:column; align-items:flex-start;">
    <p><strong>⚡ Management Tool</stron-g></p>
    <div>
        <img src="https://img.shields.io/badge/jira-0052CC?style=for-the-badge&logo=jira&logoColor=white"> 
        <img src="https://img.shields.io/badge/gitlab-FC6D26?style=for-the-badge&logo=gitlab&logoColor=white">  
        <img src="https://img.shields.io/badge/mattermost-0058CC?style=for-the-badge&logo=mattermost&logoColor=white"> 
        <img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white"> 
       <img src="https://img.shields.io/badge/figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white">
    </div>
    <br>
    <p><strong>⚡ IDE</strong></p>
    <div>
        <img src="https://img.shields.io/badge/vscode-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white"> 
        <img src="https://img.shields.io/badge/intellij-000000?style=for-the-badge&logo=intellijidea&logoColor=white">  
    </div>
    <br>
    <p><strong>⚡ Infra</strong></p>
    <div>
        <img src="https://img.shields.io/badge/docker-2496ED?style=for-the-badge&logo=docker&logoColor=white">
    </div>
    <br>
    <!-- Frontend -->
    <p><strong>⚡ Frontend</strong></p>
    <div>
        <img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white"> 
        <img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white"> 
        <img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=white"> 
        <img src="https://img.shields.io/badge/vue.js-4FC08D?style=for-the-badge&logo=vuedotjs&logoColor=white">
        <img src="https://img.shields.io/badge/react-61DAFB?style=for-the-badge&logo=react&logoColor=white">
    </div>
    <br>
    <!-- Backend -->
    <p><strong>⚡ Backend</strong></p>
    <div>
        <img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white"> 
        <img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=for-the-badge&logo=spring boot&logoColor=white">
       <img src="https://img.shields.io/badge/spring jpa-6DB33F?style=for-the-badge&logo=spring&logoColor=white">
       <img src="https://img.shields.io/badge/spring batch-6DB33F?style=for-the-badge&logo=spring&logoColor=white">
       <img src="https://img.shields.io/badge/spring security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white">
       <img src="https://img.shields.io/badge/jwt-000000?style=for-the-badge&logo=jsonwebtokens&logoColor=white">
       <img src="https://img.shields.io/badge/swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=white">
       <img src="https://img.shields.io/badge/apache kafka-231F20?style=for-the-badge&logo=apachekafka&logoColor=white">
       <img src="https://img.shields.io/badge/Node.js-339933?style=for-the-badge&logo=nodedotjs&logoColor=white">
    </div>
    <br>
    <!-- Database -->
    <p><strong>⚡ Database</strong></p>
    <div>
        <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
    </div>
    <br>
    <!-- Server -->
    <p><strong>⚡ Server</strong></p>
    <div>
        <img src="https://img.shields.io/badge/nginx-009639?style=for-the-badge&logo=nginx&logoColor=white">
        <img src="https://img.shields.io/badge/amazon ec2-FF9900?style=for-the-badge&logo=amazonec2&logoColor=white">
        <img src="https://img.shields.io/badge/amazon s3-569A31?style=for-the-badge&logo=amazons3&logoColor=white">
    </div>
    <br>
    <!-- Others -->
    <p><strong>⚡ Code review</strong></p>
    <div>
        <img src="https://img.shields.io/badge/gerrit-EEEEEE?style=for-the-badge&logo=gerrit&logoColor=white"> 
    </div>
    <br>
</div>
<br><br>

# 4️⃣ 서비스 화면
### 🌈 로그인
![로그인](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/76e80ee6-1d76-4d1e-836c-d8cd1f474010)
### 🌈 공고 검색 및 상세
![공고_검색_및_상세](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/91af74d3-adcc-4e15-ac4b-2e77eba6c4fa)
### 🌈 공고 등록
![공고등록](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/7e66df18-aff9-4e49-a737-a930dc8b9006)
### 🌈 자기소개서 문항 작성
![자기소개서_문항_작성](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/c375d4e6-4a36-4c79-98e3-fdefe1fab2ca)
### 🌈 자기소개서 문항 편집
![자기소개서_문항_편집](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/334ea836-d475-402b-b9fe-3683c15d5d1a)
### 🌈 전형 생성
![전형_생성](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/16f753e4-0cb8-46ca-8b52-53bdb820af14)
### 🌈 전형 전용 이력서 생성
![전형_전용_이력서_생성](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/e2bc2b2d-bb53-42a4-ab7d-816be04309e2)
### 🌈 전형 리뷰 생성
![전형_리뷰_생성](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/7bebc0ac-575b-4346-a748-48e9641ff8e2)
### 🌈 입사지원서 작성 및 다운
![입사지원서_작성_및_다운](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/2f2c2c3a-bd83-431f-8aba-3d235c3eb8c7)
### 🌈 다이어리
![다이어리](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/77171eda-6b51-4d7e-b892-ff681109fee1)
### 🌈 커뮤니티
![커뮤니티](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/ac04cb42-a039-4d2e-97be-a788a3d66130)
### 🌈 설정
![설정](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/815e93f5-479c-4ac5-8a3b-0053ccc5864e)

# 5️⃣ 주요 기능
### 📌 개인 맞춤 채용일정 관리
- 스크랩 공고 전형 일정 캘린더 연동
- 외부 전형 관리
- 개인 일정 관리
- 전형 리뷰 다이어리 작성

### 📌 이력서 자소서 통합 관리/내보내기
- 이력서 자동 완성
- 자소서 맞춤법 검사
- 이력서 자소서 통합 관리
- PDF 내보내기 

### 📌 현직자-취준생 커피챗
- WebRTC 활용 실시간 화상 커피챗
- 현직자-취준생 커넥션 생성
- 추가 질문 Q&A 게시판 이용

### 📌 실시간 알림 기능
- 커피챗 신청, 수락 및 거절 알림
- 금일 개인 일정 알림
- 마감 임박 전형 일정 알림
- 지원 현황 및 복기 알림

### 📌 OpenAI 면접 예상질문 제공
- 자소서 기반 모의면접
- Chat GPT Open API 활용 예상질문 추천
<br><br>

# 6️⃣ 기술 소개
### ⭐ 취준 캘린더
- FullCalendar를 활용하여 사용자 맞춤 일정관리 경험 제공

### ⭐ 실시간 화상 커피챗
- WebRTC를 활용한 텍스트 및 화상 채팅 기능으로 뛰어난 사용자 경험 제공

### ⭐ 소셜 로그인
- Spring Security와 OAuth2.0을 활용하여 로그인 및 회원가입 절차 최소화

### ⭐ 채용 공고
- Spring Batch와 사람인 API를 활용하여 정확하고 방대한 채용 공고 제공

### ⭐ 실시간 알림
- Kafka와 SSE를 활용한 알림 기능으로 일정 관리의 편의성 제공
<br><br>

# 7️⃣ 설계 문서
### 📂 Swagger
<img src="https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/e2cb4f0c-d9a2-4bc1-800f-4f4e7168ac7a" width="400" />
<img src="https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/8c282012-8f9c-47f1-9eda-6a90d15f5a12" width="400" />

### 📂 ERD
![image](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/013c6d53-ebec-40ad-9ea0-abb42fc0fd7e)

### 📂 서비스 아키텍처
![image](https://github.com/hyun0-25/SSAFY-JOBLOG/assets/95136913/91965060-8288-44de-bebd-fd76f0317da1)
