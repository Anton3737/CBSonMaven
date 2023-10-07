<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">

        <style>
            html {
            charset: UTF-8;
            background-image: linear-gradient(to right top, #051937, #004d7a, #008793, #00bf72, #a8eb12);
            }

            h2{
            margin: 20px auto;
            }

            div {
            width: 300px;
            margin: 20px auto;
            padding: 15px;
            border: 1px solid #000000;
            border-radius: 8px;
            background-image: linear-gradient(to right top, #051937, #004d7a, #008793, #00bf72, #a8eb12);
            transition: background 0.4s ease;
            }

            div:hover {
            background-image: linear-gradient(to right top, #051937, #004d7a, #008793, #00bf72, #a8eb12);
            animation: shake 0.8s ease;
            }

            @keyframes shake {
            0%, 100% {
            transform: translateX(0);
            }
            25%, 75% {
            transform: translateX(-5px);
            }
            50% {
            transform: translateX(5px);
            }
            }

            h3 {
            color: #355B3A;
            }

            p {
            margin: 10px 0;
            }

            strong {
            font-weight: bold;
            }

            p strong {
            color: #000000;
            }

        </style>
        <html>
            <body>
                <h2>Candy Information</h2>
                <xsl:apply-templates/>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="candy">
        <div>
            <h3>
                <xsl:value-of select="name"/>
            </h3>
            <p>
                <strong>Flavor:</strong>
                <xsl:value-of select="flavor"/>
            </p>
            <p>
                <strong>Color:</strong>
                <xsl:value-of select="color"/>
            </p>
        </div>
    </xsl:template>

</xsl:stylesheet>
