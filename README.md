# 오프라인 테스트 - java-chicken-2019

## 미션 요구사항

<br>

## 구현해야 할 기능 목록

> 테이블을 출력한 후 테이블의 번호를 입력 받아오고, 메뉴들을 출력하는 부분까지는 main 메소드에 구현되어 있음.

1. (UI - **구현완료**) 사용 가능한 기능을 메인화면에 출력하는 기능.

2. (UI - **구현완료**) 사용자가 원하는 기능을 입력 받아오는 기능.

   - (예외) 숫자가 아닌 값이 들어오는 예외 처리.

   - (예외) 1부터 3까지의 숫자가 아닌 수가 들어오는 예외 처리.

3. (Business - **구현완료**) 주문기능과 결제기능을 가지는 POS를 생성하는 기능.

   - (구현) 주문기능과 결제기능이 Table들을 접근할 수 있도록 구현.

4. (Business - **구현완료**) 사용자가 입력한 기능의 숫자에 해당 기능을 불러오는 기능.

5. (Business - **구현완료**) 주문 기능에서 주문할 테이블을 입력받고, 등록할 메뉴를 입력받는 기능.

6. (UI - **구현완료**) 주문 기능에서 사용자가 등록할 메뉴를 입력 받아오는 기능.

7. (UI - **구현완료**) 주문 기능에서 등록할 메뉴의 수량을 입력 받아오는 기능.

8. (Business) 메뉴의 주문 가능한 최대 수량을 99개로 제한하는 기능.

9. (UI) 결제가 진행되지 않은 테이블은 별도로 표시하는 기능.

10. (UI) 주문한 내역을 출력하는 기능.

11. (UI) 결제 방법을 입력받는 기능.

12. (Business) 현금 결제의 경우 5%의 할인을 진행하는 기능.

13. (Business) 주문한 치킨의 수량의 합이 10개가 넘는 경우에 10,000원씩 추가로 할인하는 기능.

14. (UI) 최종 결제 금액을 출력하는 기능.

15. (UI) 주문 혹은 결제가 불가능한 경우, 그 이유를 보여 주고, 다시 주문 혹은 결제가 가능하도록 하는 기능.

<br>

## 개발 진행 계획

<br>

1. [미션 요구사항](##-미션-요구사항)들과 [구현해야 할 기능 목록](##-구현해야-할-기능-목록)을 대략적으로 작성.

   - 과제의 진행에 필요한 내용들을 [README.md](/README.md)에서 모두 볼 수 있도록 작성.

   - 먼저 [기능 요구사항](###-기능-요구사항)들을 바탕으로해서 큰 기능 단위로 기능 목록 작성.

2. [구현해야 할 기능 목록](##-구현해야-할-기능-목록)에 대한 세부적인 기능 재분류 및 예외 처리 작성.

   - 처음 작성한 기능 목록에서 차례로 구현해가면서 필요한 기능 목록 추가.

   - 기능 구현시 처리해야 할 예외 처리 작업도 기능 목록에 추가.
