INSERT INTO users (name, password, email) VALUES ('User', '$2b$12$MQzcbydE6P0Zh/Pc0/5P2.KsM7XOugRBvEBBG3o6YKByuymGD9zxq', 'user@example.com');

INSERT INTO luck_message (uuid, message, author, create_at, update_at, delete_at, is_active)
VALUES
-- 1
(gen_random_uuid(), 'A persistência é o caminho do êxito.', 'Charles Chaplin', NOW(), NOW(), '2025-01-01 00:00:00', TRUE),
-- 2
(gen_random_uuid(), 'O sucesso é a soma de pequenos esforços repetidos dia após dia.', 'Robert Collier', NOW(), NOW(), '2024-01-01 00:00:00', TRUE),
-- 3
(gen_random_uuid(), 'A vida é 10% do que acontece com você e 90% de como você reage a isso.', 'Charles Swindoll', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 4
(gen_random_uuid(), 'Você é o que você faz, não o que diz que vai fazer.', 'Carl Jung', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 5
(gen_random_uuid(), 'Acredite que você pode e você já está no meio do caminho.', 'Theodore Roosevelt', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 6
(gen_random_uuid(), 'Não importa quão devagar você vá, desde que você não pare.', 'Confúcio', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 7
(gen_random_uuid(), 'O sucesso não é final, o fracasso não é fatal: é a coragem de continuar que conta.', 'Winston Churchill', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 8
(gen_random_uuid(), 'A melhor maneira de prever o futuro é criá-lo.', 'Abraham Lincoln', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 9
(gen_random_uuid(), 'Sua atitude, não sua aptidão, determinará sua altitude.', 'Zig Ziglar', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 10
(gen_random_uuid(), 'Se você quer algo que nunca teve, você precisa fazer algo que nunca fez.', 'Thomas Jefferson', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 11
(gen_random_uuid(), 'A melhor vingança é um sucesso estrondoso.', 'Frank Sinatra', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 12
(gen_random_uuid(), 'Sonhos não funcionam a menos que você faça.', 'John C. Maxwell', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 13
(gen_random_uuid(), 'Tudo que você pode imaginar é real.', 'Pablo Picasso', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 14
(gen_random_uuid(), 'Não se pode atravessar o mar apenas olhando para a água.', 'Rabindranath Tagore', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 15
(gen_random_uuid(), 'Grandes mentes discutem ideias, mentes medianas discutem eventos, mentes pequenas discutem pessoas.', 'Eleanor Roosevelt', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 16
(gen_random_uuid(), 'Não existe um caminho para a felicidade. A felicidade é o caminho.', 'Thich Nhat Hanh', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 17
(gen_random_uuid(), 'Acredite em milagres, mas não dependa deles.', 'Immanuel Kant', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 18
(gen_random_uuid(), 'Faça hoje o que outros não querem, faça amanhã o que outros não podem.', 'Jerry Rice', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 19
(gen_random_uuid(), 'Quem quer vencer um obstáculo deve armar-se da força do leão e da prudência da serpente.', 'Píndaro', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 20
(gen_random_uuid(), 'A felicidade depende de nós mesmos.', 'Aristóteles', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 21
(gen_random_uuid(), 'Nunca é tarde demais para ser aquilo que você sempre desejou ser.', 'George Eliot', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 22
(gen_random_uuid(), 'Seja a mudança que você quer ver no mundo.', 'Mahatma Gandhi', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 23
(gen_random_uuid(), 'O verdadeiro heroísmo está em transformar os desejos em realidades e as ideias em feitos.', 'Madame de Staël', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 24
(gen_random_uuid(), 'O medo é a mãe da moralidade.', 'Friedrich Nietzsche', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 25
(gen_random_uuid(), 'Coragem é a resistência ao medo, domínio do medo, e não ausência do medo.', 'Mark Twain', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 26
(gen_random_uuid(), 'O talento vence jogos, mas só o trabalho em equipe ganha campeonatos.', 'Michael Jordan', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 27
(gen_random_uuid(), 'Ninguém pode fazer você se sentir inferior sem o seu consentimento.', 'Eleanor Roosevelt', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 28
(gen_random_uuid(), 'Quem ousa vence.', 'Winston Churchill', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 29
(gen_random_uuid(), 'O trabalho duro supera o talento quando o talento não trabalha duro.', 'Tim Notke', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 30
(gen_random_uuid(), 'Foque no progresso, não na perfeição.', 'Bill Phillips', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 31
(gen_random_uuid(), 'A única maneira de fazer um ótimo trabalho é amar o que você faz.', 'Steve Jobs', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 32
(gen_random_uuid(), 'Quando uma porta da felicidade se fecha, outra se abre.', 'Helen Keller', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 33
(gen_random_uuid(), 'O que você faz hoje pode melhorar todos os seus amanhãs.', 'Ralph Marston', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 34
(gen_random_uuid(), 'É o que você aprende depois de saber tudo que realmente importa.', 'John Wooden', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 35
(gen_random_uuid(), 'Se não puder voar, corra. Se não puder correr, ande. Se não puder andar, rasteje, mas continue em frente.', 'Martin Luther King Jr.', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 36
(gen_random_uuid(), 'Nossa maior glória não está em nunca cair, mas em nos levantarmos toda vez que caímos.', 'Confúcio', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 37
(gen_random_uuid(), 'A simplicidade é o último grau da sofisticação.', 'Leonardo da Vinci', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 38
(gen_random_uuid(), 'A imaginação é mais importante que o conhecimento.', 'Albert Einstein', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 39
(gen_random_uuid(), 'A sorte favorece os audazes.', 'Virgílio', NOW(), NOW(), '1970-01-01 00:00:00', TRUE),
-- 40
(gen_random_uuid(), 'Não espere por oportunidades. Crie-as.', 'George Bernard Shaw', NOW(), NOW(), '1970-01-01 00:00:00', TRUE);