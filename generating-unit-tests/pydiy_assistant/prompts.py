import openai

PROMPT_TEMPLATE = """
    write a unit test for the following code:
    {code}
"""

def generate_unit_test(code):
    response = openai.Completion.create(
        engine="text-davinci-003",  
        prompt=PROMPT_TEMPLATE.format(code=code),
        max_tokens=3000,
    )
    return response.choices[0].text.strip()
