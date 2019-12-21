# 우아한 테크코스 오프라인 코딩 테스트 - 치킨집

##### version 1.0   

#### 프로그램 개요 :  
치킨집 사장님의 포스기를 구현하기   


#### 기능 요구사항 :
- 주문등록, 결제하기, 프로그램 종료 기능을 가진다.        
- 메뉴 기본 정보가 주어지며 메뉴 번호, 종류, 이름, 가격을 가진다.    
- 테이블 기본 정보가 주어지며 테이블 번호를 가진다.   
- 한 테이블에서 주문할 수 있는 한 메뉴의 최대 수량은 99개이다.    
- 주문이 등록된 테이블은 결제가 이루어지기 전까지 테이블 목록에 별도로 표시한다.  

#### 깃 커밋 키워드 :  
- Complete : 기능구현 완료시 (헤드)
- Add: 클래스나 파일이 추가될 경우 (바디)  
- Fix: 기능 버그의 수정 
- Modify: 가독성과 로직을 위한 코드 수정
- Update : 문서 업데이트 (README.md, javadoc, ETC)  
- Refactor : 리팩토링

#### 기능 목록 :
- 메인 실행 기능  
- [x] 프로그램을 실행한다.(입력이 3이 아닐 경우에는 무한루프)  
- [x] 메인기능에서 사용자가 3을 입력하면 종료하도록 한다.

- 치킨집 POS기 컨트롤 로직 기능 (이 기능을 구현하여 Complete 키워드로 커밋한다)
- [x] 메인에서 사용자에게 1, 2, 3에 대한 입력을 받고 그에 따라 주문관리, 결제관리, 종료 기능을 실행한다.(간단하게 연결만 해둔다)  
- [x] 주문관리 기능을 구현한다. (예외처리)
- [ ] 결제관리 기능을 구현한다. (예외처리)  
- [ ] 계산관리 기능을 구현한다. (예외처리)  
   
- 치킨집 모델 기능  
- [x] 주문 모델 작성
- [x] 주문 받은 테이블 작성
- [x] 주문 받은 테이블들 작성

- 출력문 기능
- [x] 사용자에게 메인기능선택을 물어봐야한다.
- [x] 사용자에게 테이블을 선택하게 해야한다.
- [x] 사용자에게 등록할 메뉴를 선택하게 물어봐야한다.
- [x] 사용자게에 해당 메뉴의 수량을 물어봐야한다.
- [ ] 사용자에게 결제 수단을 물어봐야한다.
- [ ] 최종 결제 금액을 표시한다.
- [ ] 치킨집의 테이블을 출력해야한다.
- [ ] 치킨집 테이블이 결제 전, 주문 후라면 다르게 출력해야한다.
- [ ] 치킨집 메뉴를 출력해야한다.


- 사용자 입력 기능  
- [x] 사용자에게 기능을 입력받아야한다.
- [x] 사용자에게 테이블을 입력받아야한다.
- [x] 사용자에게 메뉴를 입력받아야한다.
- [x] 사용자에게 수량을 입력받아야한다.
- [ ] 사용자에게 결제수단을 입력받아야한다.

- 유효성 검사 기능
- [x] 사용자가 입력이 정수인지 검사해야한다. (예외처리)
- [ ] 사용자의 각 입력이 해당 입력에 따른 유효성 여부를 통과해야한다.  
예를들면 테이블 입력은 1, 2, 3, 5, 6, 8 중 하나여야 한다.

- 계산관련 컨트롤 기능  
- [ ] 치킨종류의 주문 개수 10개마다 만원할인 적용한다.
- [ ] 추가로 현금이면 5%할인 적용한다.

