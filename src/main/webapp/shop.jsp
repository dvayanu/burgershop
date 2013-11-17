<!DOCTYPE html>
<%@ taglib uri="http://www.anotheria.net/ano-tags" prefix="ano"
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Burger Shop</title>
    <link rel="stylesheet" href="css/common.css"/>
    <script src="js/general.js"></script>
    <!--[if IE]>
    <script>
        document.createElement('header');
        document.createElement('nav');
        document.createElement('section');
        document.createElement('article');
        document.createElement('aside');
        document.createElement('footer');
    </script>
    <![endif]-->

    <script type="text/javascript">
        $(document).ready(function(){

            $("tr:first").show();

            var prices = [];
            var step_names = ['bread', 'meat', 'options'];
            var step = 1;
            $('#step_index').text(step);
            $('#step_name').text("Select your " + step_names[0]);

            $("table tr td").click(function(){
                $(this).siblings('.active_item').removeClass('active_item')
                $(this).addClass("active_item");
                $(this).siblings().find('.dark').remove();
                $(this).siblings().append("<div class='dark'></div>");

                var tr_index = $(this).closest('tr').index();




                prices[tr_index] = parseFloat($(this).find(".price span").text());
                var total_price = 0;
                $.each(prices, function(index, price){
                    total_price += price;
                });
                $(".total_cost p span").text(total_price.toFixed(2) + ' €');

                var $nextLine = $(this).closest('tr').next();
                if($nextLine.length > 0){
                    $nextLine.show();
                    if(!$(this).closest('tr').hasClass('step_done')){
                        $('#step_index').text(++step);
                        $('#step_name').text("Select your " + step_names[tr_index+1]);
                        $(this).closest('tr').addClass('step_done');
                    }
                }
                else{
                    $(".lightbox").show();
                    $(".oder_now p").text('Order now ' + total_price.toFixed(2) + ' €');
                    $(this).closest('table').addClass('selection_complete');

                }
            });


            //close lightbox
            $('.black_bg, .close_box').click(function() {
                $('.lightbox').hide();
                return false;
            });



        });

    </script>
</head>

<body class="inner_bg">

<header class="main">
    <div class="logo_line"></div>
    <img src="img/logo.png"/>
    <h1 class="line_name">
        <div>
            <span id="step_index">1</span>
            <span id="step_name"></span>
        </div>
    </h1>
</header>
<table cellpadding="0" cellspacing="0">
    <tbody>
    <tr>
        <ano:iterate name="breads" id="bread" type="de.zaunberg.burgershop.ui.ShopItemBean">
            <td class="item <ano:write name="bread" property="name"/>">

                <div class="price">
                    <span><ano:write name="bread" property="price"/></span>
                </div>

                <div class="item_name">
                    <p class=""><ano:write name="bread" property="name"/></p>
                    <div></div>
                </div>

            </td>
        </ano:iterate>
    </tr>
    <tr>
        <td class="twolineitem1">
            <div class="price">
                <span> 13.85 € </span>
            </div>

            <div class="item_name">
                <p class="">cow</p>
                <div></div>
            </div>

        </td>

        <td class="twolineitem2">
            <div class="price">
                <span> 11.85 € </span>
            </div>
            <div class="item_name">
                <p class="">pork</p>
                <div></div>
            </div>
        </td>
        <td class="twolineitem3">
            <div class="price">
                <span> 18.85 € </span>
            </div>
            <div class="item_name">
                <p class="">lamb</p>
                <div></div>
            </div>
        </td>
        <td class="twolineitem4">
            <div class="price">
                <span> 19.85 € </span>
            </div>
            <div class="item_name">
                <p class="">dog</p>
                <div></div>
            </div>
        </td>
        <td class="twolineitem5">
            <div class="price">
                <span> 15.85 € </span>
            </div>
            <div class="item_name">
                <p class="">rat</p>
                <div></div>
            </div>
        </td>

    </tr>
    <tr>
        <td class="threelineitem1">
            <div class="price">
                <span> 10.85 € </span>
            </div>

            <div class="item_name">
                <p class="">mushrooms</p>
                <div></div>
            </div>

        </td>

        <td class="threelineitem2">
            <div class="price">
                <span> 8.55 € </span>
            </div>
            <div class="item_name">
                <p class="">brocolli</p>
                <div></div>
            </div>
        </td>
        <td class="threelineitem3">
            <div class="price">
                <span> 10.15 € </span>
            </div>
            <div class="item_name">
                <p class="">cheese</p>
                <div></div>
            </div>
        </td>
        <td class="threelineitem4">
            <div class="price">
                <span> 8.85 € </span>
            </div>
            <div class="item_name">
                <p class="">sauce</p>
                <div></div>
            </div>
        </td>
        <td class="threelineitem5">
            <div class="price">
                <span> 10.85 € </span>
            </div>
            <div class="item_name">
                <p class="">сockroach</p>
                <div></div>
            </div>
        </td>

    </tr>
    </tbody>
</table>

<div class="total_cost">
    <div></div>
    <p> Total cost: <span>0</span></p>
</div>


<div class="lightbox">
    <div class="black_bg"><!-- --></div>
    <div class="box_l">
        <div class="oder_now">
            <a class="close_box">x</a>
            <p></p>
        </div>

    </div>
</div>



</body>
</html>