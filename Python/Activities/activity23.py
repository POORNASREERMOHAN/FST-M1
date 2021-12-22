import pytest

@pytest.fixture
def create_list():
    list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    return list

def test_sum(create_list):
    sum=0
    for n in create_list:
        sum=sum+n
    assert sum==55