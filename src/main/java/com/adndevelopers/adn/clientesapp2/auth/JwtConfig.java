package com.adndevelopers.adn.clientesapp2.auth;

public class JwtConfig {

	public static final String LLAVE_SECRETA= "alguna.Clave.Secreta.Muy.Importante.98765432117492196864";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEogIBAAKCAQEApTUQ9i9N5dkmTlH8mponVrSFAysOw9bIDGIOxb0kt4QifPxA\r\n" + 
			"HX0hZG31t4ciaoK0VfINsn0mAr6WcDajStd4t4dMeiY01IWY+kSQGpVPJNfI3wwC\r\n" + 
			"RBwZ9ECECokZMQaaBceBiuhIanVEuh4yORDvT5CMIdylTDYJ7xSfeV4whGBTG9t7\r\n" + 
			"KCh3wXdmLR0vgsVshLP8O1JBonz+Q4Sbuyz7uz8u4dgRuAWeTYn1uToiDMowpzL4\r\n" + 
			"0w8uw+dbgptjAEnwXScvks2u2lNIM0pGBqhRG4elPWvzQLJtPZIMQKIR0pgLkr/r\r\n" + 
			"Zw2fvDchxB/teyYlVox5BwPLwKEsm1Exu2aI+wIDAQABAoIBAAkUe5QsUWm6n6Ja\r\n" + 
			"WzncEyFu1oiwCyW0XlZf5VP061myx3p7GsMEJ5uvd3vYz4lvGZ5HqX0P59DqzLXq\r\n" + 
			"KttoMFhV9VwZUXoExb2rmwf7ANiTi5TGwjEgIkUMbrVth5bsN/btWi9aSPCg9WAN\r\n" + 
			"XNFKHv0OgsUxrVwc9DrRtVokVSJRWmMa++u1X5ztKTUnTTo2DNhpOnKU385lw3uY\r\n" + 
			"cM4W/sMfFwjM2ItyssUHgumFyVWujoh2OxhmEigz1ktZoO6bAh3+wyd1Q7ZiAwlo\r\n" + 
			"mPXcfysfC21MHU1W0V0qQW34TQztonEwCDPI5iwgmqecpD8iLTmW4N3IlhM+zXDj\r\n" + 
			"Fv+6bVECgYEA0rbkQNLjJeIHcLJ4yzpvyMPHG7Mbq1rHFG16Tyv6vnbmSBtIL2YC\r\n" + 
			"Xj6RTZaVSFB/0L00ieyRtOBAf3dRxCe+/sNfzJQp6OQTNnuWxI0A0e7GL/z/6VF+\r\n" + 
			"kTx4dknTHD0ApF5J7KNoj4uhBsQNg0htFwEAjbs2Uh035n4lMmLxyzcCgYEAyLZ1\r\n" + 
			"YM4AJO8pBResm+UrfXv7B8byVKlkwhTffEgjibtU6Q7HgjXsEL5/jgy0SIC9ftQx\r\n" + 
			"EVNJ+xP7HXzdklIUWEyIVebfP4T7UCjfi0Af9gii27Zu+zC42wKwyLF2MHyGiGhz\r\n" + 
			"n0HKKmnQnOdjlrR4NpPMRxLXk8396C3oNAXE+l0CgYBIm9sld0XsjOmRbP5w0U8p\r\n" + 
			"uETJB7v2HQ7SvDLUS0xZC3Go0TXbl2Qjg53gRY5lX8/bZwdOq6U91bSD9+LGHAgV\r\n" + 
			"k89UGI4kgUsZkBbQ3eG1dXj3mk+432skstizsha7+U1aVl9U2q4yIKQ5R598aJ2m\r\n" + 
			"uqKtNCCwxP65PyikJzI4mwKBgAQos7nzytD5G7J9URhR4VrSTNtWZgMXF31mDVN3\r\n" + 
			"8zSRaysBIWUzVNbr+5yn6rxt3n9YSkP/o9LOETAFPFoh1UYXH+QXypx4VvTMRAWQ\r\n" + 
			"qJjiiO1glGAkHFB9d8hQ1RAgJHGDKJIuPNAwLSBzMv8Wcj8/RMZcP5dSd2ZuPReG\r\n" + 
			"3xQJAoGAb77DqPqE8AElYx2l/rOdeNni7/WXKKUv0SEKWqh6Iy7ZyYhK8AY2K/NJ\r\n" + 
			"B0eL7rUt2EtEShFSthZXPLZp0TRhdltIwUsqMbQvJOwlkkyJCXoYigEWpVb/h+jh\r\n" + 
			"EEHM/kE+o+4LJaDf6y6dEMconzOWrE8IQe5vaMk2W6ZPhOkLBsA=\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApTUQ9i9N5dkmTlH8mpon\r\n" + 
			"VrSFAysOw9bIDGIOxb0kt4QifPxAHX0hZG31t4ciaoK0VfINsn0mAr6WcDajStd4\r\n" + 
			"t4dMeiY01IWY+kSQGpVPJNfI3wwCRBwZ9ECECokZMQaaBceBiuhIanVEuh4yORDv\r\n" + 
			"T5CMIdylTDYJ7xSfeV4whGBTG9t7KCh3wXdmLR0vgsVshLP8O1JBonz+Q4Sbuyz7\r\n" + 
			"uz8u4dgRuAWeTYn1uToiDMowpzL40w8uw+dbgptjAEnwXScvks2u2lNIM0pGBqhR\r\n" + 
			"G4elPWvzQLJtPZIMQKIR0pgLkr/rZw2fvDchxB/teyYlVox5BwPLwKEsm1Exu2aI\r\n" + 
			"+wIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
}
