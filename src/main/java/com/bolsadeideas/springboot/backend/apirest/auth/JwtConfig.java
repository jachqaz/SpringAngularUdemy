package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {
    public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
    public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\n" +
            "MIIEpQIBAAKCAQEAzvp1SV8xuutRaHkv/7IUw7NkHjvz5X4bnz6inBjbS6dhOSRk\n" +
            "14vfDG35ZDf3LmFGh81uN0rr2gi9pGCc1nj2nJ5yWr0fiaANM4IXA8vyIw6TjQDm\n" +
            "wKj1Oal8EkIoyoGHgo1YmABmosKyuJNuEriMqtMwJF5E4GHf1OJjdrsrPYEgmt54\n" +
            "C8nmaxqH/h7wUeTMfBq/7Z7M9P60tlrqp5C/KGAhLM1lwpaD40rnaXmV3sSnk8cX\n" +
            "lsI6YG0aeKURoz2zXwKLz6JABxWgYAAlRRK1Gw9us6TJuuHt9f4+830aJPboaQQI\n" +
            "VswP8Imgbue68/uqNktI1SOH1f+y3Wlx+SRNyQIDAQABAoIBAClDAui6ooZZ7SO/\n" +
            "rRLzZHJTK+1fFFM23bjUWsR1rBob5yTmHXhe+PtYXTRed9d2KwJdsNAzDmur/Gpt\n" +
            "nDahbMByUefG9ieQkbEoCQCHwuC8QiwE9vuHc0OohwR4zfr48ZPUK8o5ojxmRgzH\n" +
            "z1TKF7jiWyGU7XQx7tZYv21nCMq8vHGZ95lC0KFaYu6AEXx2+5eHS/xlllWW7uCe\n" +
            "XyMLq9KSu3iG8EsL+9chDONHH7wPALStOu5oqYYGSQ7ocODuLCY2cdGn33kODFmC\n" +
            "pzcBKsJYYqjZVMIKstxT8eqvqZqhzJPBFTgNLD1A5rXoZWTiyuSQE/x9iA7mfgvF\n" +
            "mLYjXqUCgYEA77ZWUaAfdwCdIyY5ZJbk6l4uEqR2LhMFhApf7zDzhvEfNU8+L/og\n" +
            "kmJrkcpJw9T1R0WqB+EpkF2xr9U9FeyRX3KQrN+5pMQnhRMzNGbGdEZ+k/MspnV7\n" +
            "/c7QpcLEQxyz+gKthHptEj40OGpUtQse/OXzva1DdZOD/lAwi8mF0wMCgYEA3Qq7\n" +
            "lM+CqS1B11XUV55h86nUi9McdTO8PhpKqFsHcW0vmV5EPuULHgT/yEgM8Tqa6DzB\n" +
            "Etn9sZ6R0O/Ban4fdmvz/wfb4yKHy/ObaWteniXrLy3iXcrElKWfyhXdzw01/rD/\n" +
            "wHuqU1XJbNJ9NWucgohN0GQZHolxcFux3XjDXEMCgYEAyUf8FzIy+YPkbn1MN/CU\n" +
            "a0+FtFWwfmOuf/8OKxSZiDezktnlR/fpncFSvep0IiIRizUt3svsULK73v9Y+a3Z\n" +
            "K6JRZTe+9GFZJd7HYjribQQ8iRLp7SQ9ZxNgE7AFiKzzWv0golsCdw0QYEa4tgSO\n" +
            "kqCsGBsCyBmD/elruhUPb+0CgYEAj9v1W5N2aV6wFFKjAWduPqRQVbRPOCQ0poJ8\n" +
            "BnhALt0t9nY4mmp9QstkIVhrO/C1cuJfkkJX72rRYhc4XXO6TFtUEK5vuLL3iJCC\n" +
            "nCiqCumI2ErXoc1fBZOJnH+AvcnOU3Wk7gRORTB3CKExpjvkP7wwUKllA8/WCZdT\n" +
            "+l0nYHsCgYEAi/szL3Dgya+INFKWvyTOpe2Yl5j73LAeaQn4YzxKH0ICgkskFTlH\n" +
            "RFqt1sLc1pL0HcigVI45tHaT0t5W1+ctK6AXQ2g+KBQInONc206HrU6Q/AwOuucC\n" +
            "xk3p/QaWpWuTxYyNyLixng+ZinfwJKXYcD2hdk/V5dq0DMesJz/d6O4=\n" +
            "-----END RSA PRIVATE KEY-----\n";
    public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzvp1SV8xuutRaHkv/7IU\n" +
            "w7NkHjvz5X4bnz6inBjbS6dhOSRk14vfDG35ZDf3LmFGh81uN0rr2gi9pGCc1nj2\n" +
            "nJ5yWr0fiaANM4IXA8vyIw6TjQDmwKj1Oal8EkIoyoGHgo1YmABmosKyuJNuEriM\n" +
            "qtMwJF5E4GHf1OJjdrsrPYEgmt54C8nmaxqH/h7wUeTMfBq/7Z7M9P60tlrqp5C/\n" +
            "KGAhLM1lwpaD40rnaXmV3sSnk8cXlsI6YG0aeKURoz2zXwKLz6JABxWgYAAlRRK1\n" +
            "Gw9us6TJuuHt9f4+830aJPboaQQIVswP8Imgbue68/uqNktI1SOH1f+y3Wlx+SRN\n" +
            "yQIDAQAB\n" +
            "-----END PUBLIC KEY-----\n";
}
