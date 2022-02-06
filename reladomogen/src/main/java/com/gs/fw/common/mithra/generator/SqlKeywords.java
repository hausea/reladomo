package com.gs.fw.common.mithra.generator;

import java.util.HashSet;

public class SqlKeywords
{
    private static final HashSet<String> KEYWORDS = new HashSet<>();

    static
    {
        KEYWORDS.add("A");
        KEYWORDS.add("ABORT");
        KEYWORDS.add("ABS");
        KEYWORDS.add("ABSOLUTE");
        KEYWORDS.add("ACCESS");
        KEYWORDS.add("ACTION");
        KEYWORDS.add("ADA");
        KEYWORDS.add("ADD");
        KEYWORDS.add("ADMIN");
        KEYWORDS.add("AFTER");
        KEYWORDS.add("AGGREGATE");
        KEYWORDS.add("ALIAS");
        KEYWORDS.add("ALL");
        KEYWORDS.add("ALLOCATE");
        KEYWORDS.add("ALSO");
        KEYWORDS.add("ALTER");
        KEYWORDS.add("ALWAYS");
        KEYWORDS.add("ANALYSE");
        KEYWORDS.add("ANALYZE");
        KEYWORDS.add("AND");
        KEYWORDS.add("ANY");
        KEYWORDS.add("ARE");
        KEYWORDS.add("ARRAY");
        KEYWORDS.add("AS");
        KEYWORDS.add("ASC");
        KEYWORDS.add("ASENSITIVE");
        KEYWORDS.add("ASSERTION");
        KEYWORDS.add("ASSIGNMENT");
        KEYWORDS.add("ASYMMETRIC");
        KEYWORDS.add("AT");
        KEYWORDS.add("ATOMIC");
        KEYWORDS.add("ATTRIBUTE");
        KEYWORDS.add("ATTRIBUTES");
        KEYWORDS.add("AUDIT");
        KEYWORDS.add("AUTHORIZATION");
        KEYWORDS.add("AUTO_INCREMENT");
        KEYWORDS.add("AVG");
        KEYWORDS.add("AVG_ROW_LENGTH");
        KEYWORDS.add("BACKUP");
        KEYWORDS.add("BACKWARD");
        KEYWORDS.add("BEFORE");
        KEYWORDS.add("BEGIN");
        KEYWORDS.add("BERNOULLI");
        KEYWORDS.add("BETWEEN");
        KEYWORDS.add("BIGINT");
        KEYWORDS.add("BINARY");
        KEYWORDS.add("BIT");
        KEYWORDS.add("BIT_LENGTH");
        KEYWORDS.add("BITVAR");
        KEYWORDS.add("BLOB");
        KEYWORDS.add("BOOL");
        KEYWORDS.add("BOOLEAN");
        KEYWORDS.add("BOTH");
        KEYWORDS.add("BREADTH");
        KEYWORDS.add("BREAK");
        KEYWORDS.add("BROWSE");
        KEYWORDS.add("BULK");
        KEYWORDS.add("BY");
        KEYWORDS.add("C");
        KEYWORDS.add("CACHE");
        KEYWORDS.add("CALL");
        KEYWORDS.add("CALLED");
        KEYWORDS.add("CARDINALITY");
        KEYWORDS.add("CASCADE");
        KEYWORDS.add("CASCADED");
        KEYWORDS.add("CASE");
        KEYWORDS.add("CAST");
        KEYWORDS.add("CATALOG");
        KEYWORDS.add("CATALOG_NAME");
        KEYWORDS.add("CEIL");
        KEYWORDS.add("CEILING");
        KEYWORDS.add("CHAIN");
        KEYWORDS.add("CHANGE");
        KEYWORDS.add("CHAR");
        KEYWORDS.add("CHAR_LENGTH");
        KEYWORDS.add("CHARACTER");
        KEYWORDS.add("CHARACTER_LENGTH");
        KEYWORDS.add("CHARACTER_SET_CATALOG");
        KEYWORDS.add("CHARACTER_SET_NAME");
        KEYWORDS.add("CHARACTER_SET_SCHEMA");
        KEYWORDS.add("CHARACTERISTICS");
        KEYWORDS.add("CHARACTERS");
        KEYWORDS.add("CHECK");
        KEYWORDS.add("CHECKED");
        KEYWORDS.add("CHECKPOINT");
        KEYWORDS.add("CHECKSUM");
        KEYWORDS.add("CLASS");
        KEYWORDS.add("CLASS_ORIGIN");
        KEYWORDS.add("CLOB");
        KEYWORDS.add("CLOSE");
        KEYWORDS.add("CLUSTER");
        KEYWORDS.add("CLUSTERED");
        KEYWORDS.add("COALESCE");
        KEYWORDS.add("COBOL");
        KEYWORDS.add("COLLATE");
        KEYWORDS.add("COLLATION");
        KEYWORDS.add("COLLATION_CATALOG");
        KEYWORDS.add("COLLATION_NAME");
        KEYWORDS.add("COLLATION_SCHEMA");
        KEYWORDS.add("COLLECT");
        KEYWORDS.add("COLUMN");
        KEYWORDS.add("COLUMN_NAME");
        KEYWORDS.add("COLUMNS");
        KEYWORDS.add("COMMAND_FUNCTION");
        KEYWORDS.add("COMMAND_FUNCTION_CODE");
        KEYWORDS.add("COMMENT");
        KEYWORDS.add("COMMIT");
        KEYWORDS.add("COMMITTED");
        KEYWORDS.add("COMPLETION");
        KEYWORDS.add("COMPRESS");
        KEYWORDS.add("COMPUTE");
        KEYWORDS.add("CONDITION");
        KEYWORDS.add("CONDITION_NUMBER");
        KEYWORDS.add("CONNECT");
        KEYWORDS.add("CONNECTION");
        KEYWORDS.add("CONNECTION_NAME");
        KEYWORDS.add("CONSTRAINT");
        KEYWORDS.add("CONSTRAINT_CATALOG");
        KEYWORDS.add("CONSTRAINT_NAME");
        KEYWORDS.add("CONSTRAINT_SCHEMA");
        KEYWORDS.add("CONSTRAINTS");
        KEYWORDS.add("CONSTRUCTOR");
        KEYWORDS.add("CONTAINS");
        KEYWORDS.add("CONTAINSTABLE");
        KEYWORDS.add("CONTINUE");
        KEYWORDS.add("CONVERSION");
        KEYWORDS.add("CONVERT");
        KEYWORDS.add("COPY");
        KEYWORDS.add("CORR");
        KEYWORDS.add("CORRESPONDING");
        KEYWORDS.add("COUNT");
        KEYWORDS.add("COVAR_POP");
        KEYWORDS.add("COVAR_SAMP");
        KEYWORDS.add("CREATE");
        KEYWORDS.add("CREATEDB");
        KEYWORDS.add("CREATEROLE");
        KEYWORDS.add("CREATEUSER");
        KEYWORDS.add("CROSS");
        KEYWORDS.add("CSV");
        KEYWORDS.add("CUBE");
        KEYWORDS.add("CUME_DIST");
        KEYWORDS.add("CURRENT");
        KEYWORDS.add("CURRENT_DATE");
        KEYWORDS.add("CURRENT_DEFAULT_TRANSFORM_GROUP");
        KEYWORDS.add("CURRENT_PATH");
        KEYWORDS.add("CURRENT_ROLE");
        KEYWORDS.add("CURRENT_TIME");
        KEYWORDS.add("CURRENT_TIMESTAMP");
        KEYWORDS.add("CURRENT_TRANSFORM_GROUP_FOR_TYPE");
        KEYWORDS.add("CURRENT_USER");
        KEYWORDS.add("CURSOR");
        KEYWORDS.add("CURSOR_NAME");
        KEYWORDS.add("CYCLE");
        KEYWORDS.add("DATA");
        KEYWORDS.add("DATABASE");
        KEYWORDS.add("DATABASES");
        KEYWORDS.add("DATE");
        KEYWORDS.add("DATETIME");
        KEYWORDS.add("DATETIME_INTERVAL_CODE");
        KEYWORDS.add("DATETIME_INTERVAL_PRECISION");
        KEYWORDS.add("DAY");
        KEYWORDS.add("DAY_HOUR");
        KEYWORDS.add("DAY_MICROSECOND");
        KEYWORDS.add("DAY_MINUTE");
        KEYWORDS.add("DAY_SECOND");
        KEYWORDS.add("DAYOFMONTH");
        KEYWORDS.add("DAYOFWEEK");
        KEYWORDS.add("DAYOFYEAR");
        KEYWORDS.add("DBCC");
        KEYWORDS.add("DEALLOCATE");
        KEYWORDS.add("DEC");
        KEYWORDS.add("DECIMAL");
        KEYWORDS.add("DECLARE");
        KEYWORDS.add("DEFAULT");
        KEYWORDS.add("DEFAULTS");
        KEYWORDS.add("DEFERRABLE");
        KEYWORDS.add("DEFERRED");
        KEYWORDS.add("DEFINED");
        KEYWORDS.add("DEFINER");
        KEYWORDS.add("DEGREE");
        KEYWORDS.add("DELAY_KEY_WRITE");
        KEYWORDS.add("DELAYED");
        KEYWORDS.add("DELETE");
        KEYWORDS.add("DELIMITER");
        KEYWORDS.add("DELIMITERS");
        KEYWORDS.add("DENSE_RANK");
        KEYWORDS.add("DENY");
        KEYWORDS.add("DEPTH");
        KEYWORDS.add("DEREF");
        KEYWORDS.add("DERIVED");
        KEYWORDS.add("DESC");
        KEYWORDS.add("DESCRIBE");
        KEYWORDS.add("DESCRIPTOR");
        KEYWORDS.add("DESTROY");
        KEYWORDS.add("DESTRUCTOR");
        KEYWORDS.add("DETERMINISTIC");
        KEYWORDS.add("DIAGNOSTICS");
        KEYWORDS.add("DICTIONARY");
        KEYWORDS.add("DISABLE");
        KEYWORDS.add("DISCONNECT");
        KEYWORDS.add("DISK");
        KEYWORDS.add("DISPATCH");
        KEYWORDS.add("DISTINCT");
        KEYWORDS.add("DISTINCTROW");
        KEYWORDS.add("DISTRIBUTED");
        KEYWORDS.add("DIV");
        KEYWORDS.add("DO");
        KEYWORDS.add("DOMAIN");
        KEYWORDS.add("DOUBLE");
        KEYWORDS.add("DROP");
        KEYWORDS.add("DUAL");
        KEYWORDS.add("DUMMY");
        KEYWORDS.add("DUMP");
        KEYWORDS.add("DYNAMIC");
        KEYWORDS.add("DYNAMIC_FUNCTION");
        KEYWORDS.add("DYNAMIC_FUNCTION_CODE");
        KEYWORDS.add("EACH");
        KEYWORDS.add("ELEMENT");
        KEYWORDS.add("ELSE");
        KEYWORDS.add("ELSEIF");
        KEYWORDS.add("ENABLE");
        KEYWORDS.add("ENCLOSED");
        KEYWORDS.add("ENCODING");
        KEYWORDS.add("ENCRYPTED");
        KEYWORDS.add("END");
        KEYWORDS.add("END-EXEC");
        KEYWORDS.add("ENUM");
        KEYWORDS.add("EQUALS");
        KEYWORDS.add("ERRLVL");
        KEYWORDS.add("ESCAPE");
        KEYWORDS.add("ESCAPED");
        KEYWORDS.add("EVERY");
        KEYWORDS.add("EXCEPT");
        KEYWORDS.add("EXCEPTION");
        KEYWORDS.add("EXCLUDE");
        KEYWORDS.add("EXCLUDING");
        KEYWORDS.add("EXCLUSIVE");
        KEYWORDS.add("EXEC");
        KEYWORDS.add("EXECUTE");
        KEYWORDS.add("EXISTING");
        KEYWORDS.add("EXISTS");
        KEYWORDS.add("EXIT");
        KEYWORDS.add("EXP");
        KEYWORDS.add("EXPLAIN");
        KEYWORDS.add("EXTERNAL");
        KEYWORDS.add("EXTRACT");
        KEYWORDS.add("FALSE");
        KEYWORDS.add("FETCH");
        KEYWORDS.add("FIELDS");
        KEYWORDS.add("FILE");
        KEYWORDS.add("FILLFACTOR");
        KEYWORDS.add("FILTER");
        KEYWORDS.add("FINAL");
        KEYWORDS.add("FIRST");
        KEYWORDS.add("FLOAT");
        KEYWORDS.add("FLOAT4");
        KEYWORDS.add("FLOAT8");
        KEYWORDS.add("FLOOR");
        KEYWORDS.add("FLUSH");
        KEYWORDS.add("FOLLOWING");
        KEYWORDS.add("FOR");
        KEYWORDS.add("FORCE");
        KEYWORDS.add("FOREIGN");
        KEYWORDS.add("FORTRAN");
        KEYWORDS.add("FORWARD");
        KEYWORDS.add("FOUND");
        KEYWORDS.add("FREE");
        KEYWORDS.add("FREETEXT");
        KEYWORDS.add("FREETEXTTABLE");
        KEYWORDS.add("FREEZE");
        KEYWORDS.add("FROM");
        KEYWORDS.add("FULL");
        KEYWORDS.add("FULLTEXT");
        KEYWORDS.add("FUNCTION");
        KEYWORDS.add("FUSION");
        KEYWORDS.add("G");
        KEYWORDS.add("GENERAL");
        KEYWORDS.add("GENERATED");
        KEYWORDS.add("GET");
        KEYWORDS.add("GLOBAL");
        KEYWORDS.add("GO");
        KEYWORDS.add("GOTO");
        KEYWORDS.add("GRANT");
        KEYWORDS.add("GRANTED");
        KEYWORDS.add("GRANTS");
        KEYWORDS.add("GREATEST");
        KEYWORDS.add("GROUP");
        KEYWORDS.add("GROUPING");
        KEYWORDS.add("HANDLER");
        KEYWORDS.add("HAVING");
        KEYWORDS.add("HEADER");
        KEYWORDS.add("HEAP");
        KEYWORDS.add("HIERARCHY");
        KEYWORDS.add("HIGH_PRIORITY");
        KEYWORDS.add("HOLD");
        KEYWORDS.add("HOLDLOCK");
        KEYWORDS.add("HOST");
        KEYWORDS.add("HOSTS");
        KEYWORDS.add("HOUR");
        KEYWORDS.add("HOUR_MICROSECOND");
        KEYWORDS.add("HOUR_MINUTE");
        KEYWORDS.add("HOUR_SECOND");
        KEYWORDS.add("IDENTIFIED");
        KEYWORDS.add("IDENTITY");
        KEYWORDS.add("IDENTITY_INSERT");
        KEYWORDS.add("IDENTITYCOL");
        KEYWORDS.add("IF");
        KEYWORDS.add("IGNORE");
        KEYWORDS.add("ILIKE");
        KEYWORDS.add("IMMEDIATE");
        KEYWORDS.add("IMMUTABLE");
        KEYWORDS.add("IMPLEMENTATION");
        KEYWORDS.add("IMPLICIT");
        KEYWORDS.add("IN");
        KEYWORDS.add("INCLUDE");
        KEYWORDS.add("INCLUDING");
        KEYWORDS.add("INCREMENT");
        KEYWORDS.add("INDEX");
        KEYWORDS.add("INDICATOR");
        KEYWORDS.add("INFILE");
        KEYWORDS.add("INFIX");
        KEYWORDS.add("INHERIT");
        KEYWORDS.add("INHERITS");
        KEYWORDS.add("INITIAL");
        KEYWORDS.add("INITIALIZE");
        KEYWORDS.add("INITIALLY");
        KEYWORDS.add("INNER");
        KEYWORDS.add("INOUT");
        KEYWORDS.add("INPUT");
        KEYWORDS.add("INSENSITIVE");
        KEYWORDS.add("INSERT");
        KEYWORDS.add("INSERT_ID");
        KEYWORDS.add("INSTANCE");
        KEYWORDS.add("INSTANTIABLE");
        KEYWORDS.add("INSTEAD");
        KEYWORDS.add("INT");
        KEYWORDS.add("INT1");
        KEYWORDS.add("INT2");
        KEYWORDS.add("INT3");
        KEYWORDS.add("INT4");
        KEYWORDS.add("INT8");
        KEYWORDS.add("INTEGER");
        KEYWORDS.add("INTERSECT");
        KEYWORDS.add("INTERSECTION");
        KEYWORDS.add("INTERVAL");
        KEYWORDS.add("INTO");
        KEYWORDS.add("INVOKER");
        KEYWORDS.add("IS");
        KEYWORDS.add("ISAM");
        KEYWORDS.add("ISNULL");
        KEYWORDS.add("ISOLATION");
        KEYWORDS.add("ITERATE");
        KEYWORDS.add("JOIN");
        KEYWORDS.add("K");
        KEYWORDS.add("KEY");
        KEYWORDS.add("KEY_MEMBER");
        KEYWORDS.add("KEY_TYPE");
        KEYWORDS.add("KEYS");
        KEYWORDS.add("KILL");
        KEYWORDS.add("LANCOMPILER");
        KEYWORDS.add("LANGUAGE");
        KEYWORDS.add("LARGE");
        KEYWORDS.add("LAST");
        KEYWORDS.add("LAST_INSERT_ID");
        KEYWORDS.add("LATERAL");
        KEYWORDS.add("LEAD");
        KEYWORDS.add("LEADING");
        KEYWORDS.add("LEAST");
        KEYWORDS.add("LEAVE");
        KEYWORDS.add("LEFT");
        KEYWORDS.add("LENGTH");
        KEYWORDS.add("LESS");
        KEYWORDS.add("LEVEL");
        KEYWORDS.add("LIKE");
        KEYWORDS.add("LIMIT");
        KEYWORDS.add("LINENO");
        KEYWORDS.add("LINES");
        KEYWORDS.add("LISTEN");
        KEYWORDS.add("LN");
        KEYWORDS.add("LOAD");
        KEYWORDS.add("LOCAL");
        KEYWORDS.add("LOCALTIME");
        KEYWORDS.add("LOCALTIMESTAMP");
        KEYWORDS.add("LOCATION");
        KEYWORDS.add("LOCATOR");
        KEYWORDS.add("LOCK");
        KEYWORDS.add("LOGIN");
        KEYWORDS.add("LOGS");
        KEYWORDS.add("LONG");
        KEYWORDS.add("LONGBLOB");
        KEYWORDS.add("LONGTEXT");
        KEYWORDS.add("LOOP");
        KEYWORDS.add("LOW_PRIORITY");
        KEYWORDS.add("LOWER");
        KEYWORDS.add("M");
        KEYWORDS.add("MAP");
        KEYWORDS.add("MATCH");
        KEYWORDS.add("MATCHED");
        KEYWORDS.add("MAX");
        KEYWORDS.add("MAX_ROWS");
        KEYWORDS.add("MAXEXTENTS");
        KEYWORDS.add("MAXVALUE");
        KEYWORDS.add("MEDIUMBLOB");
        KEYWORDS.add("MEDIUMINT");
        KEYWORDS.add("MEDIUMTEXT");
        KEYWORDS.add("MEMBER");
        KEYWORDS.add("MERGE");
        KEYWORDS.add("MESSAGE_LENGTH");
        KEYWORDS.add("MESSAGE_OCTET_LENGTH");
        KEYWORDS.add("MESSAGE_TEXT");
        KEYWORDS.add("METHOD");
        KEYWORDS.add("MIDDLEINT");
        KEYWORDS.add("MIN");
        KEYWORDS.add("MIN_ROWS");
        KEYWORDS.add("MINUS");
        KEYWORDS.add("MINUTE");
        KEYWORDS.add("MINUTE_MICROSECOND");
        KEYWORDS.add("MINUTE_SECOND");
        KEYWORDS.add("MINVALUE");
        KEYWORDS.add("MLSLABEL");
        KEYWORDS.add("MOD");
        KEYWORDS.add("MODE");
        KEYWORDS.add("MODIFIES");
        KEYWORDS.add("MODIFY");
        KEYWORDS.add("MODULE");
        KEYWORDS.add("MONTH");
        KEYWORDS.add("MONTHNAME");
        KEYWORDS.add("MORE");
        KEYWORDS.add("MOVE");
        KEYWORDS.add("MULTISET");
        KEYWORDS.add("MUMPS");
        KEYWORDS.add("MYISAM");
        KEYWORDS.add("NAME");
        KEYWORDS.add("NAMES");
        KEYWORDS.add("NATIONAL");
        KEYWORDS.add("NATURAL");
        KEYWORDS.add("NCHAR");
        KEYWORDS.add("NCLOB");
        KEYWORDS.add("NESTING");
        KEYWORDS.add("NEW");
        KEYWORDS.add("NEXT");
        KEYWORDS.add("NO");
        KEYWORDS.add("NO_WRITE_TO_BINLOG");
        KEYWORDS.add("NOAUDIT");
        KEYWORDS.add("NOCHECK");
        KEYWORDS.add("NOCOMPRESS");
        KEYWORDS.add("NOCREATEDB");
        KEYWORDS.add("NOCREATEROLE");
        KEYWORDS.add("NOCREATEUSER");
        KEYWORDS.add("NOINHERIT");
        KEYWORDS.add("NOLOGIN");
        KEYWORDS.add("NONCLUSTERED");
        KEYWORDS.add("NONE");
        KEYWORDS.add("NORMALIZE");
        KEYWORDS.add("NORMALIZED");
        KEYWORDS.add("NOSUPERUSER");
        KEYWORDS.add("NOT");
        KEYWORDS.add("NOTHING");
        KEYWORDS.add("NOTIFY");
        KEYWORDS.add("NOTNULL");
        KEYWORDS.add("NOWAIT");
        KEYWORDS.add("NULL");
        KEYWORDS.add("NULLABLE");
        KEYWORDS.add("NULLIF");
        KEYWORDS.add("NULLS");
        KEYWORDS.add("NUMBER");
        KEYWORDS.add("NUMERIC");
        KEYWORDS.add("OBJECT");
        KEYWORDS.add("OCTET_LENGTH");
        KEYWORDS.add("OCTETS");
        KEYWORDS.add("OF");
        KEYWORDS.add("OFF");
        KEYWORDS.add("OFFLINE");
        KEYWORDS.add("OFFSET");
        KEYWORDS.add("OFFSETS");
        KEYWORDS.add("OIDS");
        KEYWORDS.add("OLD");
        KEYWORDS.add("ON");
        KEYWORDS.add("ONLINE");
        KEYWORDS.add("ONLY");
        KEYWORDS.add("OPEN");
        KEYWORDS.add("OPENDATASOURCE");
        KEYWORDS.add("OPENQUERY");
        KEYWORDS.add("OPENROWSET");
        KEYWORDS.add("OPENXML");
        KEYWORDS.add("OPERATION");
        KEYWORDS.add("OPERATOR");
        KEYWORDS.add("OPTIMIZE");
        KEYWORDS.add("OPTION");
        KEYWORDS.add("OPTIONALLY");
        KEYWORDS.add("OPTIONS");
        KEYWORDS.add("OR");
        KEYWORDS.add("ORDER");
        KEYWORDS.add("ORDERING");
        KEYWORDS.add("ORDINALITY");
        KEYWORDS.add("OTHERS");
        KEYWORDS.add("OUT");
        KEYWORDS.add("OUTER");
        KEYWORDS.add("OUTFILE");
        KEYWORDS.add("OUTPUT");
        KEYWORDS.add("OVER");
        KEYWORDS.add("OVERLAPS");
        KEYWORDS.add("OVERLAY");
        KEYWORDS.add("OVERRIDING");
        KEYWORDS.add("OWNER");
        KEYWORDS.add("PACK_KEYS");
        KEYWORDS.add("PAD");
        KEYWORDS.add("PARAMETER");
        KEYWORDS.add("PARAMETER_MODE");
        KEYWORDS.add("PARAMETER_NAME");
        KEYWORDS.add("PARAMETER_ORDINAL_POSITION");
        KEYWORDS.add("PARAMETER_SPECIFIC_CATALOG");
        KEYWORDS.add("PARAMETER_SPECIFIC_NAME");
        KEYWORDS.add("PARAMETER_SPECIFIC_SCHEMA");
        KEYWORDS.add("PARAMETERS");
        KEYWORDS.add("PARTIAL");
        KEYWORDS.add("PARTITION");
        KEYWORDS.add("PASCAL");
        KEYWORDS.add("PASSWORD");
        KEYWORDS.add("PATH");
        KEYWORDS.add("PCTFREE");
        KEYWORDS.add("PERCENT");
        KEYWORDS.add("PERCENT_RANK");
        KEYWORDS.add("PERCENTILE_CONT");
        KEYWORDS.add("PERCENTILE_DISC");
        KEYWORDS.add("PLACING");
        KEYWORDS.add("PLAN");
        KEYWORDS.add("PLI");
        KEYWORDS.add("POSITION");
        KEYWORDS.add("POSTFIX");
        KEYWORDS.add("POWER");
        KEYWORDS.add("PRECEDING");
        KEYWORDS.add("PRECISION");
        KEYWORDS.add("PREFIX");
        KEYWORDS.add("PREORDER");
        KEYWORDS.add("PREPARE");
        KEYWORDS.add("PREPARED");
        KEYWORDS.add("PRESERVE");
        KEYWORDS.add("PRIMARY");
        KEYWORDS.add("PRINT");
        KEYWORDS.add("PRIOR");
        KEYWORDS.add("PRIVILEGES");
        KEYWORDS.add("PROC");
        KEYWORDS.add("PROCEDURAL");
        KEYWORDS.add("PROCEDURE");
        KEYWORDS.add("PROCESS");
        KEYWORDS.add("PROCESSLIST");
        KEYWORDS.add("PUBLIC");
        KEYWORDS.add("PURGE");
        KEYWORDS.add("QUOTE");
        KEYWORDS.add("RAID0");
        KEYWORDS.add("RAISERROR");
        KEYWORDS.add("RANGE");
        KEYWORDS.add("RANK");
        KEYWORDS.add("RAW");
        KEYWORDS.add("READ");
        KEYWORDS.add("READS");
        KEYWORDS.add("READTEXT");
        KEYWORDS.add("REAL");
        KEYWORDS.add("RECHECK");
        KEYWORDS.add("RECONFIGURE");
        KEYWORDS.add("RECURSIVE");
        KEYWORDS.add("REF");
        KEYWORDS.add("REFERENCES");
        KEYWORDS.add("REFERENCING");
        KEYWORDS.add("REGEXP");
        KEYWORDS.add("REGR_AVGX");
        KEYWORDS.add("REGR_AVGY");
        KEYWORDS.add("REGR_COUNT");
        KEYWORDS.add("REGR_INTERCEPT");
        KEYWORDS.add("REGR_R2");
        KEYWORDS.add("REGR_SLOPE");
        KEYWORDS.add("REGR_SXX");
        KEYWORDS.add("REGR_SXY");
        KEYWORDS.add("REGR_SYY");
        KEYWORDS.add("REINDEX");
        KEYWORDS.add("RELATIVE");
        KEYWORDS.add("RELEASE");
        KEYWORDS.add("RELOAD");
        KEYWORDS.add("RENAME");
        KEYWORDS.add("REPEAT");
        KEYWORDS.add("REPEATABLE");
        KEYWORDS.add("REPLACE");
        KEYWORDS.add("REPLICATION");
        KEYWORDS.add("REQUIRE");
        KEYWORDS.add("RESET");
        KEYWORDS.add("RESIGNAL");
        KEYWORDS.add("RESOURCE");
        KEYWORDS.add("RESTART");
        KEYWORDS.add("RESTORE");
        KEYWORDS.add("RESTRICT");
        KEYWORDS.add("RESULT");
        KEYWORDS.add("RETURN");
        KEYWORDS.add("RETURNED_CARDINALITY");
        KEYWORDS.add("RETURNED_LENGTH");
        KEYWORDS.add("RETURNED_OCTET_LENGTH");
        KEYWORDS.add("RETURNED_SQLSTATE");
        KEYWORDS.add("RETURNS");
        KEYWORDS.add("REVOKE");
        KEYWORDS.add("RIGHT");
        KEYWORDS.add("RLIKE");
        KEYWORDS.add("ROLE");
        KEYWORDS.add("ROLLBACK");
        KEYWORDS.add("ROLLUP");
        KEYWORDS.add("ROUTINE");
        KEYWORDS.add("ROUTINE_CATALOG");
        KEYWORDS.add("ROUTINE_NAME");
        KEYWORDS.add("ROUTINE_SCHEMA");
        KEYWORDS.add("ROW");
        KEYWORDS.add("ROW_COUNT");
        KEYWORDS.add("ROW_NUMBER");
        KEYWORDS.add("ROWCOUNT");
        KEYWORDS.add("ROWGUIDCOL");
        KEYWORDS.add("ROWID");
        KEYWORDS.add("ROWNUM");
        KEYWORDS.add("ROWS");
        KEYWORDS.add("RULE");
        KEYWORDS.add("SAVE");
        KEYWORDS.add("SAVEPOINT");
        KEYWORDS.add("SCALE");
        KEYWORDS.add("SCHEMA");
        KEYWORDS.add("SCHEMA_NAME");
        KEYWORDS.add("SCHEMAS");
        KEYWORDS.add("SCOPE");
        KEYWORDS.add("SCOPE_CATALOG");
        KEYWORDS.add("SCOPE_NAME");
        KEYWORDS.add("SCOPE_SCHEMA");
        KEYWORDS.add("SCROLL");
        KEYWORDS.add("SEARCH");
        KEYWORDS.add("SECOND");
        KEYWORDS.add("SECOND_MICROSECOND");
        KEYWORDS.add("SECTION");
        KEYWORDS.add("SECURITY");
        KEYWORDS.add("SELECT");
        KEYWORDS.add("SELF");
        KEYWORDS.add("SENSITIVE");
        KEYWORDS.add("SEPARATOR");
        KEYWORDS.add("SEQUENCE");
        KEYWORDS.add("SERIALIZABLE");
        KEYWORDS.add("SERVER_NAME");
        KEYWORDS.add("SESSION");
        KEYWORDS.add("SESSION_USER");
        KEYWORDS.add("SET");
        KEYWORDS.add("SETOF");
        KEYWORDS.add("SETS");
        KEYWORDS.add("SETUSER");
        KEYWORDS.add("SHARE");
        KEYWORDS.add("SHOW");
        KEYWORDS.add("SHUTDOWN");
        KEYWORDS.add("SIGNAL");
        KEYWORDS.add("SIMILAR");
        KEYWORDS.add("SIMPLE");
        KEYWORDS.add("SIZE");
        KEYWORDS.add("SMALLINT");
        KEYWORDS.add("SOME");
        KEYWORDS.add("SONAME");
        KEYWORDS.add("SOURCE");
        KEYWORDS.add("SPACE");
        KEYWORDS.add("SPATIAL");
        KEYWORDS.add("SPECIFIC");
        KEYWORDS.add("SPECIFIC_NAME");
        KEYWORDS.add("SPECIFICTYPE");
        KEYWORDS.add("SQL");
        KEYWORDS.add("SQL_BIG_RESULT");
        KEYWORDS.add("SQL_BIG_SELECTS");
        KEYWORDS.add("SQL_BIG_TABLES");
        KEYWORDS.add("SQL_CALC_FOUND_ROWS");
        KEYWORDS.add("SQL_LOG_OFF");
        KEYWORDS.add("SQL_LOG_UPDATE");
        KEYWORDS.add("SQL_LOW_PRIORITY_UPDATES");
        KEYWORDS.add("SQL_SELECT_LIMIT");
        KEYWORDS.add("SQL_SMALL_RESULT");
        KEYWORDS.add("SQL_WARNINGS");
        KEYWORDS.add("SQLCA");
        KEYWORDS.add("SQLCODE");
        KEYWORDS.add("SQLERROR");
        KEYWORDS.add("SQLEXCEPTION");
        KEYWORDS.add("SQLSTATE");
        KEYWORDS.add("SQLWARNING");
        KEYWORDS.add("SQRT");
        KEYWORDS.add("SSL");
        KEYWORDS.add("STABLE");
        KEYWORDS.add("START");
        KEYWORDS.add("STARTING");
        KEYWORDS.add("STATE");
        KEYWORDS.add("STATEMENT");
        KEYWORDS.add("STATIC");
        KEYWORDS.add("STATISTICS");
        KEYWORDS.add("STATUS");
        KEYWORDS.add("STDDEV_POP");
        KEYWORDS.add("STDDEV_SAMP");
        KEYWORDS.add("STDIN");
        KEYWORDS.add("STDOUT");
        KEYWORDS.add("STORAGE");
        KEYWORDS.add("STRAIGHT_JOIN");
        KEYWORDS.add("STRICT");
        KEYWORDS.add("STRING");
        KEYWORDS.add("STRUCTURE");
        KEYWORDS.add("STYLE");
        KEYWORDS.add("SUBCLASS_ORIGIN");
        KEYWORDS.add("SUBLIST");
        KEYWORDS.add("SUBMULTISET");
        KEYWORDS.add("SUBSTRING");
        KEYWORDS.add("SUCCESSFUL");
        KEYWORDS.add("SUM");
        KEYWORDS.add("SUPERUSER");
        KEYWORDS.add("SYMMETRIC");
        KEYWORDS.add("SYNONYM");
        KEYWORDS.add("SYSDATE");
        KEYWORDS.add("SYSID");
        KEYWORDS.add("SYSTEM");
        KEYWORDS.add("SYSTEM_USER");
        KEYWORDS.add("TABLE");
        KEYWORDS.add("TABLE_NAME");
        KEYWORDS.add("TABLES");
        KEYWORDS.add("TABLESAMPLE");
        KEYWORDS.add("TABLESPACE");
        KEYWORDS.add("TEMP");
        KEYWORDS.add("TEMPLATE");
        KEYWORDS.add("TEMPORARY");
        KEYWORDS.add("TERMINATE");
        KEYWORDS.add("TERMINATED");
        KEYWORDS.add("TEXT");
        KEYWORDS.add("TEXTSIZE");
        KEYWORDS.add("THAN");
        KEYWORDS.add("THEN");
        KEYWORDS.add("TIES");
        KEYWORDS.add("TIME");
        KEYWORDS.add("TIMESTAMP");
        KEYWORDS.add("TIMEZONE_HOUR");
        KEYWORDS.add("TIMEZONE_MINUTE");
        KEYWORDS.add("TINYBLOB");
        KEYWORDS.add("TINYINT");
        KEYWORDS.add("TINYTEXT");
        KEYWORDS.add("TO");
        KEYWORDS.add("TOAST");
        KEYWORDS.add("TOP");
        KEYWORDS.add("TOP_LEVEL_COUNT");
        KEYWORDS.add("TRAILING");
        KEYWORDS.add("TRAN");
        KEYWORDS.add("TRANSACTION");
        KEYWORDS.add("TRANSACTION_ACTIVE");
        KEYWORDS.add("TRANSACTIONS_COMMITTED");
        KEYWORDS.add("TRANSACTIONS_ROLLED_BACK");
        KEYWORDS.add("TRANSFORM");
        KEYWORDS.add("TRANSFORMS");
        KEYWORDS.add("TRANSLATE");
        KEYWORDS.add("TRANSLATION");
        KEYWORDS.add("TREAT");
        KEYWORDS.add("TRIGGER");
        KEYWORDS.add("TRIGGER_CATALOG");
        KEYWORDS.add("TRIGGER_NAME");
        KEYWORDS.add("TRIGGER_SCHEMA");
        KEYWORDS.add("TRIM");
        KEYWORDS.add("TRUE");
        KEYWORDS.add("TRUNCATE");
        KEYWORDS.add("TRUSTED");
        KEYWORDS.add("TSEQUAL");
        KEYWORDS.add("TYPE");
        KEYWORDS.add("UESCAPE");
        KEYWORDS.add("UID");
        KEYWORDS.add("UNBOUNDED");
        KEYWORDS.add("UNCOMMITTED");
        KEYWORDS.add("UNDER");
        KEYWORDS.add("UNDO");
        KEYWORDS.add("UNENCRYPTED");
        KEYWORDS.add("UNION");
        KEYWORDS.add("UNIQUE");
        KEYWORDS.add("UNKNOWN");
        KEYWORDS.add("UNLISTEN");
        KEYWORDS.add("UNLOCK");
        KEYWORDS.add("UNNAMED");
        KEYWORDS.add("UNNEST");
        KEYWORDS.add("UNSIGNED");
        KEYWORDS.add("UNTIL");
        KEYWORDS.add("UPDATE");
        KEYWORDS.add("UPDATETEXT");
        KEYWORDS.add("UPPER");
        KEYWORDS.add("USAGE");
        KEYWORDS.add("USE");
        KEYWORDS.add("USER");
        KEYWORDS.add("USER_DEFINED_TYPE_CATALOG");
        KEYWORDS.add("USER_DEFINED_TYPE_CODE");
        KEYWORDS.add("USER_DEFINED_TYPE_NAME");
        KEYWORDS.add("USER_DEFINED_TYPE_SCHEMA");
        KEYWORDS.add("USING");
        KEYWORDS.add("UTC_DATE");
        KEYWORDS.add("UTC_TIME");
        KEYWORDS.add("UTC_TIMESTAMP");
        KEYWORDS.add("VACUUM");
        KEYWORDS.add("VALID");
        KEYWORDS.add("VALIDATE");
        KEYWORDS.add("VALIDATOR");
        KEYWORDS.add("VALUE");
        KEYWORDS.add("VALUES");
        KEYWORDS.add("VAR_POP");
        KEYWORDS.add("VAR_SAMP");
        KEYWORDS.add("VARBINARY");
        KEYWORDS.add("VARCHAR");
        KEYWORDS.add("VARCHAR2");
        KEYWORDS.add("VARCHARACTER");
        KEYWORDS.add("VARIABLE");
        KEYWORDS.add("VARIABLES");
        KEYWORDS.add("VARYING");
        KEYWORDS.add("VERBOSE");
        KEYWORDS.add("VIEW");
        KEYWORDS.add("VOLATILE");
        KEYWORDS.add("WAITFOR");
        KEYWORDS.add("WHEN");
        KEYWORDS.add("WHENEVER");
        KEYWORDS.add("WHERE");
        KEYWORDS.add("WHILE");
        KEYWORDS.add("WIDTH_BUCKET");
        KEYWORDS.add("WINDOW");
        KEYWORDS.add("WITH");
        KEYWORDS.add("WITHIN");
        KEYWORDS.add("WITHOUT");
        KEYWORDS.add("WORK");
        KEYWORDS.add("WRITE");
        KEYWORDS.add("WRITETEXT");
        KEYWORDS.add("X509");
        KEYWORDS.add("XOR");
        KEYWORDS.add("YEAR");
        KEYWORDS.add("YEAR_MONTH");
        KEYWORDS.add("ZEROFILL");
        KEYWORDS.add("ZONE");
    }

    public static boolean isKeyword(String str)
    {
        return KEYWORDS.contains(str);
    }
}
