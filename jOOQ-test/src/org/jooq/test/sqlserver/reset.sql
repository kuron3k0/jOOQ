DELETE FROM t_exotic_types/
DELETE FROM t_639_numbers_table/
DELETE FROM t_book_to_book_store/
DELETE FROM t_book_store/
DELETE FROM t_book/
DELETE FROM t_author/
DELETE FROM t_language/
DELETE FROM t_booleans/
DELETE FROM t_dates/
DELETE FROM t_identity/
DELETE FROM t_identity_pk/
DELETE FROM t_triggers/
DELETE FROM t_error_on_update/
DELETE FROM t_3085/

DROP SEQUENCE s_author_id;/
CREATE SEQUENCE s_author_id START WITH 1;/

INSERT INTO t_language (id, cd, description, description_english) VALUES (1, 'en', 'English', 'English')/
INSERT INTO t_language (id, cd, description, description_english) VALUES (2, 'de', 'Deutsch', 'German')/
INSERT INTO t_language (id, cd, description, description_english) VALUES (3, 'fr', 'Français', 'French')/
INSERT INTO t_language (id, cd, description, description_english) VALUES (4, 'pt', null, null)/
/

INSERT INTO t_author (id, first_name, last_name, date_of_birth, year_of_birth, address)
VALUES (next value for s_author_id, 'George', 'Orwell', '1903-06-25', 1903, null),
       (next value for s_author_id, 'Paulo',  'Coelho', '1947-08-24', 1947, null)
/

INSERT INTO t_book (id, author_id, co_author_id, details_id, title, published_in, language_id, content_text, content_pdf)
VALUES (1, 1, null, null, '1984',         1948, 1, 'To know and not to know, to be conscious of complete truthfulness while telling carefully constructed lies, to hold simultaneously two opinions which cancelled out, knowing them to be contradictory and believing in both of them, to use logic against logic, to repudiate morality while laying claim to it, to believe that democracy was impossible and that the Party was the guardian of democracy, to forget, whatever it was necessary to forget, then to draw it back into memory again at the moment when it was needed, and then promptly to forget it again, and above all, to apply the same process to the process itself -- that was the ultimate subtlety; consciously to induce unconsciousness, and then, once again, to become unconscious of the act of hypnosis you had just performed. Even to understand the word ''doublethink'' involved the use of doublethink..', null),
       (2, 1, null, null, 'Animal Farm',  1945, 1, null, null),
       (3, 2, null, null, 'O Alquimista', 1988, 4, null, null),
       (4, 2, null, null, 'Brida',        1990, 2, null, null)
/

INSERT INTO t_book_store (name)
VALUES ('Orell Füssli'),
       ('Ex Libris'),
       ('Buchhandlung im Volkshaus')
/

INSERT INTO t_book_to_book_store VALUES ('Orell Füssli', 1, 10)/
INSERT INTO t_book_to_book_store VALUES ('Orell Füssli', 2, 10)/
INSERT INTO t_book_to_book_store VALUES ('Orell Füssli', 3, 10)/
INSERT INTO t_book_to_book_store VALUES ('Ex Libris', 1, 1)/
INSERT INTO t_book_to_book_store VALUES ('Ex Libris', 3, 2)/
INSERT INTO t_book_to_book_store VALUES ('Buchhandlung im Volkshaus', 3, 1)/

