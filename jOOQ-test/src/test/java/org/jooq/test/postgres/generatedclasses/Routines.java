/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses;


import org.jooq.AggregateFunction;
import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.test.postgres.generatedclasses.routines.F;
import org.jooq.test.postgres.generatedclasses.routines.F317;
import org.jooq.test.postgres.generatedclasses.routines.FArrays1;
import org.jooq.test.postgres.generatedclasses.routines.FArrays2;
import org.jooq.test.postgres.generatedclasses.routines.FArrays3;
import org.jooq.test.postgres.generatedclasses.routines.FAuthorExists;
import org.jooq.test.postgres.generatedclasses.routines.FGetOneCursor;
import org.jooq.test.postgres.generatedclasses.routines.FNumber;
import org.jooq.test.postgres.generatedclasses.routines.FOne;
import org.jooq.test.postgres.generatedclasses.routines.FSearchBook;
import org.jooq.test.postgres.generatedclasses.routines.P;
import org.jooq.test.postgres.generatedclasses.routines.P391;
import org.jooq.test.postgres.generatedclasses.routines.PArrays1;
import org.jooq.test.postgres.generatedclasses.routines.PArrays2;
import org.jooq.test.postgres.generatedclasses.routines.PArrays3;
import org.jooq.test.postgres.generatedclasses.routines.PAuthorExists;
import org.jooq.test.postgres.generatedclasses.routines.PCreateAuthor;
import org.jooq.test.postgres.generatedclasses.routines.PCreateAuthorByName;
import org.jooq.test.postgres.generatedclasses.routines.PEnhanceAddress1;
import org.jooq.test.postgres.generatedclasses.routines.PEnhanceAddress2;
import org.jooq.test.postgres.generatedclasses.routines.PEnhanceAddress3;
import org.jooq.test.postgres.generatedclasses.routines.PGetOneCursor;
import org.jooq.test.postgres.generatedclasses.routines.PGetTwoCursors;
import org.jooq.test.postgres.generatedclasses.routines.PTriggers;
import org.jooq.test.postgres.generatedclasses.routines.PUnused;
import org.jooq.test.postgres.generatedclasses.routines.SecondMax;
import org.jooq.test.postgres.generatedclasses.tables.FSearchBooks;
import org.jooq.test.postgres.generatedclasses.tables.FTables1;
import org.jooq.test.postgres.generatedclasses.tables.FTables2;
import org.jooq.test.postgres.generatedclasses.tables.FTables3;
import org.jooq.test.postgres.generatedclasses.tables.FTables4;
import org.jooq.test.postgres.generatedclasses.tables.FTables5;
import org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord;


/**
 * Convenience access to all stored procedures and functions in public
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

	/**
	 * Call <code>public.f</code>
	 */
	public static Integer f(Configuration configuration, Integer f, Integer f_) {
		F f__ = new F();
		f__.setF(f);
		f__.setF_(f_);

		f__.execute(configuration);
		return f__.getReturnValue();
	}

	/**
	 * Get <code>public.f</code> as a field
	 */
	public static Field<Integer> f(Integer f, Integer f_) {
		F f__ = new F();
		f__.setF(f);
		f__.setF_(f_);

		return f__.asField();
	}

	/**
	 * Get <code>public.f</code> as a field
	 */
	public static Field<Integer> f(Field<Integer> f, Field<Integer> f_) {
		F f__ = new F();
		f__.setF(f);
		f__.setF_(f_);

		return f__.asField();
	}

	/**
	 * Call <code>public.f_arrays</code>
	 */
	public static Integer[] fArrays1(Configuration configuration, Integer[] inArray) {
		FArrays1 f = new FArrays1();
		f.setInArray(inArray);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>public.f_arrays</code> as a field
	 */
	public static Field<Integer[]> fArrays1(Integer[] inArray) {
		FArrays1 f = new FArrays1();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Get <code>public.f_arrays</code> as a field
	 */
	public static Field<Integer[]> fArrays1(Field<Integer[]> inArray) {
		FArrays1 f = new FArrays1();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Call <code>public.f_arrays</code>
	 */
	public static Long[] fArrays2(Configuration configuration, Long[] inArray) {
		FArrays2 f = new FArrays2();
		f.setInArray(inArray);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>public.f_arrays</code> as a field
	 */
	public static Field<Long[]> fArrays2(Long[] inArray) {
		FArrays2 f = new FArrays2();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Get <code>public.f_arrays</code> as a field
	 */
	public static Field<Long[]> fArrays2(Field<Long[]> inArray) {
		FArrays2 f = new FArrays2();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Call <code>public.f_arrays</code>
	 */
	public static String[] fArrays3(Configuration configuration, String[] inArray) {
		FArrays3 f = new FArrays3();
		f.setInArray(inArray);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>public.f_arrays</code> as a field
	 */
	public static Field<String[]> fArrays3(String[] inArray) {
		FArrays3 f = new FArrays3();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Get <code>public.f_arrays</code> as a field
	 */
	public static Field<String[]> fArrays3(Field<String[]> inArray) {
		FArrays3 f = new FArrays3();
		f.setInArray(inArray);

		return f.asField();
	}

	/**
	 * Call <code>public.f_author_exists</code>
	 */
	public static Integer fAuthorExists(Configuration configuration, String authorName) {
		FAuthorExists f = new FAuthorExists();
		f.setAuthorName(authorName);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>public.f_author_exists</code> as a field
	 */
	public static Field<Integer> fAuthorExists(String authorName) {
		FAuthorExists f = new FAuthorExists();
		f.setAuthorName(authorName);

		return f.asField();
	}

	/**
	 * Get <code>public.f_author_exists</code> as a field
	 */
	public static Field<Integer> fAuthorExists(Field<String> authorName) {
		FAuthorExists f = new FAuthorExists();
		f.setAuthorName(authorName);

		return f.asField();
	}

	/**
	 * Call <code>public.f_get_one_cursor</code>
	 */
	public static Result<org.jooq.Record> fGetOneCursor(Configuration configuration, Integer[] bookIds) {
		FGetOneCursor f = new FGetOneCursor();
		f.setBookIds(bookIds);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>public.f_get_one_cursor</code> as a field
	 */
	public static Field<Result<org.jooq.Record>> fGetOneCursor(Integer[] bookIds) {
		FGetOneCursor f = new FGetOneCursor();
		f.setBookIds(bookIds);

		return f.asField();
	}

	/**
	 * Get <code>public.f_get_one_cursor</code> as a field
	 */
	public static Field<Result<org.jooq.Record>> fGetOneCursor(Field<Integer[]> bookIds) {
		FGetOneCursor f = new FGetOneCursor();
		f.setBookIds(bookIds);

		return f.asField();
	}

	/**
	 * Call <code>public.f_number</code>
	 */
	public static Integer fNumber(Configuration configuration, Integer n) {
		FNumber f = new FNumber();
		f.setN(n);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>public.f_number</code> as a field
	 */
	public static Field<Integer> fNumber(Integer n) {
		FNumber f = new FNumber();
		f.setN(n);

		return f.asField();
	}

	/**
	 * Get <code>public.f_number</code> as a field
	 */
	public static Field<Integer> fNumber(Field<Integer> n) {
		FNumber f = new FNumber();
		f.setN(n);

		return f.asField();
	}

	/**
	 * Call <code>public.f_one</code>
	 */
	public static Integer fOne(Configuration configuration) {
		FOne f = new FOne();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>public.f_one</code> as a field
	 */
	public static Field<Integer> fOne() {
		FOne f = new FOne();

		return f.asField();
	}

	/**
	 * Call <code>public.f_search_book</code>
	 */
	public static Object fSearchBook(Configuration configuration, String pTitle) {
		FSearchBook f = new FSearchBook();
		f.setPTitle(pTitle);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>public.f_search_book</code> as a field
	 */
	public static Field<Object> fSearchBook(String pTitle) {
		FSearchBook f = new FSearchBook();
		f.setPTitle(pTitle);

		return f.asField();
	}

	/**
	 * Get <code>public.f_search_book</code> as a field
	 */
	public static Field<Object> fSearchBook(Field<String> pTitle) {
		FSearchBook f = new FSearchBook();
		f.setPTitle(pTitle);

		return f.asField();
	}

	/**
	 * Call <code>public.f317</code>
	 */
	public static Integer f317(Configuration configuration, Integer p1, Integer p2, Integer p3, Integer p4) {
		F317 f = new F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>public.f317</code> as a field
	 */
	public static Field<Integer> f317(Integer p1, Integer p2, Integer p3, Integer p4) {
		F317 f = new F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		return f.asField();
	}

	/**
	 * Get <code>public.f317</code> as a field
	 */
	public static Field<Integer> f317(Field<Integer> p1, Field<Integer> p2, Field<Integer> p3, Field<Integer> p4) {
		F317 f = new F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		return f.asField();
	}

	/**
	 * Call <code>public.p</code>
	 */
	public static void p(Configuration configuration, Integer p, Integer p_) {
		P p__ = new P();
		p__.setP(p);
		p__.setP_(p_);

		p__.execute(configuration);
	}

	/**
	 * Call <code>public.p_arrays</code>
	 */
	public static Integer[] pArrays1(Configuration configuration, Integer[] inArray) {
		PArrays1 p = new PArrays1();
		p.setInArray(inArray);

		p.execute(configuration);
		return p.getOutArray();
	}

	/**
	 * Call <code>public.p_arrays</code>
	 */
	public static Long[] pArrays2(Configuration configuration, Long[] inArray) {
		PArrays2 p = new PArrays2();
		p.setInArray(inArray);

		p.execute(configuration);
		return p.getOutArray();
	}

	/**
	 * Call <code>public.p_arrays</code>
	 */
	public static String[] pArrays3(Configuration configuration, String[] inArray) {
		PArrays3 p = new PArrays3();
		p.setInArray(inArray);

		p.execute(configuration);
		return p.getOutArray();
	}

	/**
	 * Call <code>public.p_author_exists</code>
	 */
	public static Integer pAuthorExists(Configuration configuration, String authorName) {
		PAuthorExists p = new PAuthorExists();
		p.setAuthorName(authorName);

		p.execute(configuration);
		return p.getResult();
	}

	/**
	 * Call <code>public.p_create_author</code>
	 */
	public static void pCreateAuthor(Configuration configuration) {
		PCreateAuthor p = new PCreateAuthor();

		p.execute(configuration);
	}

	/**
	 * Call <code>public.p_create_author_by_name</code>
	 */
	public static void pCreateAuthorByName(Configuration configuration, String firstName, String lastName) {
		PCreateAuthorByName p = new PCreateAuthorByName();
		p.setFirstName(firstName);
		p.setLastName(lastName);

		p.execute(configuration);
	}

	/**
	 * Call <code>public.p_enhance_address1</code>
	 */
	public static String pEnhanceAddress1(Configuration configuration, UAddressTypeRecord address) {
		PEnhanceAddress1 p = new PEnhanceAddress1();
		p.setAddress(address);

		p.execute(configuration);
		return p.getNo();
	}

	/**
	 * Call <code>public.p_enhance_address2</code>
	 */
	public static UAddressTypeRecord pEnhanceAddress2(Configuration configuration) {
		PEnhanceAddress2 p = new PEnhanceAddress2();

		p.execute(configuration);
		return p.getAddress();
	}

	/**
	 * Call <code>public.p_enhance_address3</code>
	 */
	public static UAddressTypeRecord pEnhanceAddress3(Configuration configuration, UAddressTypeRecord address) {
		PEnhanceAddress3 p = new PEnhanceAddress3();
		p.setAddress(address);

		p.execute(configuration);
		return p.getAddress();
	}

	/**
	 * Call <code>public.p_get_one_cursor</code>
	 */
	public static PGetOneCursor pGetOneCursor(Configuration configuration, Integer[] bookIds) {
		PGetOneCursor p = new PGetOneCursor();
		p.setBookIds(bookIds);

		p.execute(configuration);
		return p;
	}

	/**
	 * Call <code>public.p_get_two_cursors</code>
	 */
	public static PGetTwoCursors pGetTwoCursors(Configuration configuration) {
		PGetTwoCursors p = new PGetTwoCursors();

		p.execute(configuration);
		return p;
	}

	/**
	 * Call <code>public.p_triggers</code>
	 */
	public static Object pTriggers(Configuration configuration) {
		PTriggers f = new PTriggers();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>public.p_triggers</code> as a field
	 */
	public static Field<Object> pTriggers() {
		PTriggers f = new PTriggers();

		return f.asField();
	}

	/**
	 * Call <code>public.p_unused</code>
	 */
	public static PUnused pUnused(Configuration configuration, String in1, Integer out2) {
		PUnused p = new PUnused();
		p.setIn1(in1);
		p.setOut2(out2);

		p.execute(configuration);
		return p;
	}

	/**
	 * Call <code>public.p391</code>
	 */
	public static P391 p391(Configuration configuration, Integer i1, Integer io1, Integer io2, Integer i2) {
		P391 p = new P391();
		p.setI1(i1);
		p.setIo1(io1);
		p.setIo2(io2);
		p.setI2(i2);

		p.execute(configuration);
		return p;
	}

	/**
	 * Get <code>public.second_max</code> as a field
	 */
	public static AggregateFunction<Integer> secondMax(Integer __1) {
		SecondMax f = new SecondMax();
		f.set__1(__1);

		return f.asAggregateFunction();
	}

	/**
	 * Get <code>public.second_max</code> as a field
	 */
	public static AggregateFunction<Integer> secondMax(Field<Integer> __1) {
		SecondMax f = new SecondMax();
		f.set__1(__1);

		return f.asAggregateFunction();
	}

	/**
	 * Get <code>public.f_search_books</code> as a field
	 */
	public static FSearchBooks fSearchBooks(String pTitle, Long pLimit, Long pOffset) {
		return FSearchBooks.F_SEARCH_BOOKS.call(pTitle, pLimit, pOffset);
	}

	/**
	 * Get <code>public.f_search_books</code> as a field
	 */
	public static FSearchBooks fSearchBooks(Field<String> pTitle, Field<Long> pLimit, Field<Long> pOffset) {
		return FSearchBooks.F_SEARCH_BOOKS.call(pTitle, pLimit, pOffset);
	}

	/**
	 * Get <code>public.f_tables1</code> as a field
	 */
	public static FTables1 fTables1() {
		return FTables1.F_TABLES1.call();
	}

	/**
	 * Get <code>public.f_tables2</code> as a field
	 */
	public static FTables2 fTables2() {
		return FTables2.F_TABLES2.call();
	}

	/**
	 * Get <code>public.f_tables3</code> as a field
	 */
	public static FTables3 fTables3() {
		return FTables3.F_TABLES3.call();
	}

	/**
	 * Get <code>public.f_tables4</code> as a field
	 */
	public static FTables4 fTables4(Integer inId) {
		return FTables4.F_TABLES4.call(inId);
	}

	/**
	 * Get <code>public.f_tables4</code> as a field
	 */
	public static FTables4 fTables4(Field<Integer> inId) {
		return FTables4.F_TABLES4.call(inId);
	}

	/**
	 * Get <code>public.f_tables5</code> as a field
	 */
	public static FTables5 fTables5(Integer v1, Integer v2, Integer v3) {
		return FTables5.F_TABLES5.call(v1, v2, v3);
	}

	/**
	 * Get <code>public.f_tables5</code> as a field
	 */
	public static FTables5 fTables5(Field<Integer> v1, Field<Integer> v2, Field<Integer> v3) {
		return FTables5.F_TABLES5.call(v1, v2, v3);
	}
}
