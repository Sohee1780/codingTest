-- 코드를 입력하세요

SELECT user_id, product_id 
FROM(
    SELECT user_id, product_id, COUNT(*) cnt FROM online_sale
    GROUP BY user_id, product_id
) 
WHERE cnt>1
ORDER BY user_id, product_id DESC;