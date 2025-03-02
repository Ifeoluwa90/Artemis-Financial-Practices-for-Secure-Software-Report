# Artemis Financial Secure Software Report

## Software Security for a Financial Institution

### Client Summary and Requirements
Artemis Financial is a financial consulting company that develops individualized financial plans for their customers, including savings, retirement, investments, and insurance. They approached Global Rain to modernize their operations and implement current effective security measures for their web application. Specifically, Artemis Financial needed to add a file verification step using checksums to ensure secure data transfers, and they wanted to implement secure communications via HTTPS to protect their clients' sensitive financial information.

### Security Vulnerability Assessment Strengths
In assessing Artemis Financial's application, I successfully identified several security vulnerabilities including the lack of secure communications (HTTP instead of HTTPS) and the absence of data verification mechanisms. Secure coding is critical because it protects sensitive customer data from breaches and attacks, which is particularly important for financial institutions that handle personal and financial information. Implementing robust security measures adds significant value to a company by protecting their reputation, maintaining customer trust, preventing financial losses from breaches, and ensuring compliance with industry regulations.

### Challenging and Helpful Aspects of the Vulnerability Assessment
The most challenging part of the vulnerability assessment was properly configuring the SSL certificate and ensuring it worked correctly with the Spring Boot application. Understanding the different keystore formats (JKS vs PKCS12) and properly configuring the application properties for SSL was a learning experience. The most helpful aspect was using the OWASP dependency check tool, which automatically identified potential vulnerabilities in third-party dependencies, providing a systematic approach to addressing security issues.

### Increasing Security Layers
I increased security layers by implementing:
1. HTTPS with TLS encryption for secure communications
2. SHA-256 hashing algorithm for data integrity verification
3. Self-signed certificates for encryption
4. Proper exception handling to prevent information leakage

In future projects, I would use the OWASP ZAP tool for dynamic testing, dependency-check for scanning third-party libraries, and follow the OWASP Top 10 framework to prioritize mitigations for the most critical vulnerabilities.

### Ensuring Functional and Secure Code
I ensured the code was functional and secure by testing the application after each security implementation, verifying that the HTTPS connection was established correctly, and confirming that the checksum functionality worked as expected. After refactoring, I ran the dependency-check tool again to verify that no new vulnerabilities were introduced. I also performed manual code review to check for logical errors or security issues not caught by automated tools.

### Helpful Resources and Tools
The most valuable resources I used included:
- Maven dependency-check plugin for vulnerability scanning
- Java's built-in security libraries (MessageDigest, KeyStore)
- Spring Boot's security configuration options
- OWASP Secure Coding Guidelines

These tools and practices will be valuable in future projects where security is a priority.

### Value for Future Employers
This project demonstrates my ability to:
1. Implement encryption and secure communications in a web application
2. Understand and apply cryptographic algorithms appropriately
3. Configure SSL/TLS in a Java Spring application
4. Identify and address security vulnerabilities
5. Follow industry best practices for secure software development

These skills are directly applicable to security-sensitive roles in financial, healthcare, or government sector projects.
