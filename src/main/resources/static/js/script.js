$(document).ready(function() {
    
    var priceUnit = $("#price").val();
    $('#amount').text("R$ " + priceUnit);
    
    $("#qtde").change(function() {
        var price = $("#price").val();
        var qtde  = $(this).val();

        if(qtde > 0 && price != "" && qtde != "" && price != undefined && qtde != undefined) {
             var amount = (price * qtde);

             $('#feedback-error').hide();
             $("#msg-feedback-error").text("");
             $("#amount").text("R$ " + amount);
        } else {
             $('#feedback-error').show();
             $("#msg-feedback-error").text("Valor inválido. Digite um valor superior a 0 (zero).");
             $("#amount").text("R$ 0,00");
             $(this).val("");
             $(this).focus();
        }
    });
    
    $("#frm-order").submit(function(e) {
        e.preventDefault();

        var client_id  = $(this).find("input[name=client_id]").val();
        var product_id = $(this).find("input[name=product_id]").val();
        var amount     = $("#price").val() * $(this).find("input[name=qtde]").val();
       
        if(client_id != "" && client_id != undefined && client_id != null &&
          product_id != "" && product_id != undefined && product_id != null &&
          amount != "" && amount != undefined && amount != null) {
          
          var form = {
              client_id : client_id,
              product_id: product_id,
              amount    : amount
          }
        }
       console.log($(this));
    });
});


