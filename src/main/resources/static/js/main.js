$(document).ready(function () {

    //헤더
    $(window).scroll(function () {
        // 현재 스크롤바의 위치값을 저장하는 변수 sct를 만듬.
        var sct = $(window).scrollTop();
        /*
        스크롤 위치에 맞춰 헤더모양 바꾸기
        만약 현재 스크롤 위치값이 87px이상이면 #header에 fix클래스 추가하기
        */

        if (sct >= 60) {
            $("#header").addClass("fix");
        } else {
            $("#header").removeClass("fix");
        }
    });

    // section1 메인이미지
    $(".section1-img").slick({
        arrows: false,
        fade: true,
        autoplay: true,
        autoplaySpeed: 7200,
        pauseOnFocus: false,
        focusOnSelect: false,
        pauseOnHover: false,
        dots: true,
        asNavFor: $(".section1-title")
    });
    $(".section1-title").slick({
        arrows: true,
        fade: true,
        autoplay: true,
        speed: 300,
        autoplaySpeed: 7200,
        pauseOnFocus: false,
        focusOnSelect: false,
        pauseOnHover: false,
        dots: false,
        asNavFor: $(".section1-img")
    });

    $(".section1-title").on('beforeChange', function (event, _ref, currentSlide, nextSlide) {
        var count = _ref.slideCount;
        var selectors = [nextSlide, nextSlide - count, nextSlide + count].map(function (n) {
            return '.section1-title [data-slick-index="' + n + '"]'
        }).join(',');
        $(".section1-title .slick-now").removeClass('slick-now');
        $(selectors).addClass('slick-now');

    });

    $(".section1-title").find($('.slick-slide[data-slick-index="0"]')).addClass('slick-now');


    //section2 상품 리스트
    var point = new Swiper('.point .slide', {
        slidesPerView: 3,
        spaceBetween: 30,

        //   pagination: {
        //     el: ".swiper-pagination",
        //     type: "fraction",
        //   },
        navigation: {
            nextEl: ".swiper-button-next",
            prevEl: ".swiper-button-prev",
        },
    });

    //상품 등록, 업데이트 이미지
    $('#imageUpload').change(function (event) {
        if (this.files && this.files[0]) {
            var reader = new FileReader();
            reader.onload = function (e) {
                $('#profilePreview').html('<img src="' + e.target.result + '" style="max-width: 100%;">');
            };
            reader.readAsDataURL(this.files[0]);
            let fileName = this.files[0].name; // 파일 이름 가져오기
            console.log(fileName); // 콘솔에 파일 이름 출력
        }
    });

    // 상품수량 증가 버튼 클릭 이벤트
    $(".increase-btn").click(function () {
        var $quantityInput = $(this).siblings(".quantity");
        var currentQuantity = parseInt($quantityInput.val());
        $quantityInput.val(currentQuantity + 1);
    });

    // 상품수량 감소 버튼 클릭 이벤트
    $(".decrease-btn").click(function () {
        var $quantityInput = $(this).siblings(".quantity");
        var currentQuantity = parseInt($quantityInput.val());
        if (currentQuantity > 1) {
            $quantityInput.val(currentQuantity - 1);
        }
    });

});



