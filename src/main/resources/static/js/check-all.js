function setTotal() {
    var totalSum = 0; // 총 합계를 저장할 변수 초기화

    // 체크된 모든 항목에 대해 루프 실행
    $(".item-check:checked").each(function() {
        var $row = $(this).closest("tr"); // 현재 체크박스가 있는 행 찾기
        var sum = parseInt($row.find(".sum-class").text()); // 해당 행의 합계 값 가져오기
        if (!isNaN(sum)) { // 합계 값이 숫자인 경우만
            totalSum += sum; // 총 합계에 더하기
        }
    });

    $(".totalSum").text(totalSum); // 총 합계를 페이지에 표시
}

// 체크박스 상태 변경 시 setTotal 함수 호출
$('.item-check').change(function() {
    setTotal();
});

// 모든 체크박스 선택/해제 시 setTotal 함수 호출
$('#checkAll').change(function() {
    setTotal();
});

//키보드로 치면 키업 반영이 되는데... + - 로 클릭으로 하면 또 반영이 안된다...
$(".orderQty-change").on("keyup", function(){
    setTotal();
});



