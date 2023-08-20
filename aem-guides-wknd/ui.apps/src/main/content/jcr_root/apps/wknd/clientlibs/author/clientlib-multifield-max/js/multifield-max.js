$(window).adaptTo("foundation-registry").register("foundation.validation.validator", {
    selector: "[data-foundation-validation^='multifield-max']",
    validate: function(el) {
        var validatorValue= el.getAttribute('data-validation');
      var maxlength = parseInt(validatorValue.replace("multifield-max-",""));
  
      if (isNaN(maxlength)) {
        return;
      }
  
      var length = el.items.length;
  
      if (length > maxlength) {
        return "Max allowed item is " + maxlength + ". It currently has a length of " + length + ".";
      }
    }
  });