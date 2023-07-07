CREATE TABLE VPX.VPSEQ1 (
		SEQUENCE_ID INTEGER NOT NULL,
		SEQUENCE_NAME VARCHAR(250),
		CURRENT_VALUE INTEGER,
		LONG_CURRENT_VALUE DECIMAL(10 , 2)
	)
	DATA CAPTURE NONE ;
ALTER TABLE VPX.VPSEQ1 ADD CONSTRAINT PK_VPSEQ1 PRIMARY KEY
	(SEQUENCE_ID);