# example auth0 app with spring boot

To use:

1. Create a client with auth0
2. Copy the client-id, client-secret, user-authorization-uri, access-token-uri, and user-info-uri into `src/main/resources/application.yml`
3. Convert your cert to a pem: `openssl x509 -pubkey -noout -in cert.cer` and paste that as the jwt key-value.


