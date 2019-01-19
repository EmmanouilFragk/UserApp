(function ($) {
    $(document).ready(function () {

        function validateRegistrationForm(form) {

            if (!form.length > 0) return;

            form.validate({
                rules: {
                    email: {
                        required: true,
                        email: true
                    },
                    username: {
                        required: true
                    },
                    password: {
                        required: true
                    }
                },
                messages: {
                    email: {
                        required: 'Please fill in your email address.',
                        email: 'Please fill in a proper email address.'
                    },
                    username: {
                        required: 'Please fill in a username.',
                    },
                    password: {
                        required: 'Please fill in a password.',
                    }
                }
            });
        }

        var $registerForm = $('#registerForm');

        validateRegistrationForm($registerForm);

    });
})(jQuery);